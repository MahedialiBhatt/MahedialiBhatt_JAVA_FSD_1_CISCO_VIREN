package cisco.java.innerClass;

class Outer
{
    private int age = 90;

    void dis()
    {
        System.out.println("Inside dis method");
    }

    void outerMethod()
    {
        System.out.println("INside OUter Method");

        class Inner
        {
            void innerMethod()
            {
                dis();
                System.out.println("inside innerMethod : "+age);
            }
        }
        Inner y = new Inner();
        y.innerMethod();
    }
    public void f(){}
}

public class Method_Local_Inner
{
    public static void main(String[] args)
    {
        Outer x= new Outer();
        x.outerMethod();
    }
}
