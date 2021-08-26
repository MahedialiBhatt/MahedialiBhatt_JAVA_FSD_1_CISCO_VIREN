package cisco.java.DAY7_Assignment;

abstract class pen
{
    abstract void write();
    abstract void refill();
}

class fountain_pen extends pen
{
      void write()
      {
          System.out.println("WRITING");
      }
      void refill()
      {
          System.out.println("REFILLING");
      }
      void nib()
      {
          System.out.println("inside nib method ");
      }
}

public class Assignment3
{

}
