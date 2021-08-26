package cisco.java.innerClass;

public class Member_Inner
{
    private int data=30;

    void display()
    {
        System.out.println("I am inside the outer class method ");
    }


    //Innerclass gives priority to local variable if we have same variables in inner and outer class
    //only variable accessible not method
    class Inner
    {
        Member_Inner obj = new Member_Inner();
       // private int data = 20;
        void msg()
        {
            System.out.println("data is "+ data);
        }
        void ac()
        {
            display();
        }
        void display()
        {
            System.out.println("inside the inner class method");
        }
        void outerMethod()
        {
            System.out.println("Calling outer method from inner class");
            obj.display();
        }
    }

    public static void main(String[] args)
    {
        Member_Inner obj = new Member_Inner();  //object of outer class

        Member_Inner.Inner in = obj.new Inner(); // creating object of inner class

        in.msg();
        in.ac();
     //   in.display();
        in.outerMethod();
    }
}
