package cisco.java.SimpliLearnAssignment.Lesson1;

class defaultAccessSpecifier
{
    void display()
    {
        System.out.println(" u are using Default access specifier");
    }
}

public class accessSpecifier1
{
    public static void main(String[] args)
    {
        System.out.println("Default access specifier");
        defaultAccessSpecifier obj = new defaultAccessSpecifier();
        obj.display();
    }
}
