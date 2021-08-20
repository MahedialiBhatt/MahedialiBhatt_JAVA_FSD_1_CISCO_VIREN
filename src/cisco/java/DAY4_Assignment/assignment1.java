package cisco.java.DAY4_Assignment;

import java.util.Scanner;

public class assignment1
{
    static void validate(int n) throws SalaryException
    {
        if(n<2000)
            throw new SalaryException("you need to work hard");
        else if(n>=2100 && n<=5000)
            throw new SalaryException("your salary is somehow good");
        else if(n>=5100 && n<=9000)
            throw new SalaryException("salary is very good");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int salary;
        System.out.println("Enter Salary");
        salary=sc.nextInt();

        try
        {
            validate(salary);
        }
        catch (Exception ee)
        {
            System.out.println(ee.getMessage());
        }
    }
}

class SalaryException extends Exception
{
    SalaryException(String s)
    {
        super(s);
    }
}
