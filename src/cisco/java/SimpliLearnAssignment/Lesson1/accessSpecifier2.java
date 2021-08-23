package cisco.java.SimpliLearnAssignment.Lesson1;

class privateAccessSpecifier
{
   private void display()
    {
         System.out.println(" u are using private access specifier");
    }
}

public class accessSpecifier2
{
   public static void main(String[] args)
   {
       System.out.println("Private access specifier");
       privateAccessSpecifier obj = new privateAccessSpecifier();
     //  obj.display();   error
   }
}
