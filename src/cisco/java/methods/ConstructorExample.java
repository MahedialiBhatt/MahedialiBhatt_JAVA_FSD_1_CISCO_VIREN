package cisco.java.methods;

public class ConstructorExample
{
    int id;
    String name;

    public ConstructorExample()
    {
        id=10;
        name="Hello";
        System.out.println("I m inside the default constructor");
    }
    int id1;
    String s;
    public ConstructorExample(int a,String b)
    {
       id1=a;
       s=b;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }
    void display1()
    {
        System.out.println(id1+" "+s);
    }
    public static void main(String[] args)
    {
        ConstructorExample s1;
        s1 = new ConstructorExample();

        ConstructorExample s2=new ConstructorExample();
        ConstructorExample s3=new ConstructorExample(1,"hello");
        s1.display();
        s2.display();
        s3.display1();
    }
}
