package cisco.java.DAY7_Assignment;

import java.util.Scanner;

public class Assignment2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        StringBuilder str = new StringBuilder(sc.nextLine());
        StringBuilder sv= new StringBuilder(str);
        str.reverse();

        int count=0;
        for(int i=0;i<sv.length();i++)
        {
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                count++;
            }
        }
        if(count>50){
            System.out.println("more than 50 lowercase letters");
            return;
        }
        else
        {
            if(str.toString().equals(sv.toString()))
            {
                System.out.println("Yes");
            }
            else
                System.out.println("NO");
        }

    }
}
