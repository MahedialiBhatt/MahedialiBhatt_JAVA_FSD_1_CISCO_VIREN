package cisco.java.DAY7_Assignment;

import java.util.Scanner;

public class MyCalculator
{
    long power(int n,int p) throws invalidInputException
    {
        long ans=n;
        for(int i=0;i<p;i++)
            ans*=n;

        return ans;
    }

    public static void main(String[] args) throws invalidInputException
    {
        MyCalculator obj = new MyCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n and p");
        int n = sc.nextInt();
        int p= sc.nextInt();

        try {
            if (n < 0 || p < 0)
                throw new invalidInputException("n or p should not be negative");
            else if (n == 0 && p == 0)
                throw new invalidInputException("n and p should not be zero");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
         System.out.println("power is = "+obj.power(n,p));
    }
}


class invalidInputException extends Exception
{
    invalidInputException(String str)
    {
        super(str);
    }
}
