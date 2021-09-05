package cisco.java.DAY8_Assignment;

import java.util.regex.Pattern;

public class Assignment1
{
    public static void main(String[] args)
    {
        System.out.println("EMAIL VALIDATION.................");
        System.out.println(Pattern.matches("^[a-z0-9._-]+@[a-z0-9.]+.com","firstname@gmail.com"));
        System.out.println(Pattern.matches("^[a-z0-9._-]+@[a-z0-9.]+.com","mahediali@gmail.com"));
        System.out.println(Pattern.matches("^[a-z0-9._-]+@[a-z0-9.]+.com","test123prepare@co.edu.com"));

        System.out.println("Phone number validation with +91 code ");
        System.out.println(Pattern.matches("^[+91]+[0-9]{10}","+919876543211"));

        System.out.println("Password validation ");
        System.out.println(Pattern.matches("^[A-Z]{1}[0-9]{3}[a-zA-Z]{6}+","A234acdfsg"));
    }
}
