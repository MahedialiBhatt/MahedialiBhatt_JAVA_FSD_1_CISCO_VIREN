package cisco.java.oops;

abstract class AbstractDemo
{
   private String name="abc";
   AbstractDemo()
   {
       System.out.println("inside the abstract class..");
   }
   public void myMethod()
   {
       System.out.println("Hello "+ name);
   }
   abstract public void anotherMethod();
}

public class BasicAbstractExample extends AbstractDemo
{
    BasicAbstractExample()
    {
        super();
        System.out.println("inside BasicAbstract...");
    }

    public void anotherMethod()
    {
        System.out.println("Abstract Method :");
    }

    public static void main(String [] args)
    {
        AbstractDemo obj = new BasicAbstractExample();
        obj.anotherMethod();
        obj.myMethod();
    }
}
