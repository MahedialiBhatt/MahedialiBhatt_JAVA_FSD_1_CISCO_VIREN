package cisco.java.exceptions;

public class NestedTryDemo
{
    public static void main(String[] args)
    {
        try
        {
            try
            {
                int arr[]=new int[4];
                arr[5]=6;
                checkException();
            }
            catch(Exception e)
            {
                System.out.println("Exception in nested try "+e.getMessage());
            }
        }
        finally
        {
           System.out.println("Finally outside method");
        }
    }
    public static void checkException()
    {
        try
        {
            int res=3/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException");
        }
        finally {
            System.out.println("Finally inside method");
        }
    }
}
