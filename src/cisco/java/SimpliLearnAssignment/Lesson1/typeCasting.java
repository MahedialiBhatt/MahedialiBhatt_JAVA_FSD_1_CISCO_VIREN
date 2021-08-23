package cisco.java.SimpliLearnAssignment.Lesson1;

public class typeCasting
{
    public static void main(String [] args)
    {
        System.out.println("Implicit type casting");
         char a='a';
         System.out.println(a);
         int b=a;
         System.out.println(b);
         float c=a;
         System.out.println(c);
         long d=a;
         System.out.println(d);        ;
          double e = a;
         System.out.println(e);
         System.out.println("\n");
         System.out.println("Explicit type casting");
         double aa=43.333;
         System.out.println("double"+aa);
         int bb=(int)aa;
         System.out.println("double to int "+bb);
         long cc=(long)aa;
        System.out.println("double to long "+cc);
         char dd = (char)aa;
        System.out.println("double to char "+dd);

    }
}
