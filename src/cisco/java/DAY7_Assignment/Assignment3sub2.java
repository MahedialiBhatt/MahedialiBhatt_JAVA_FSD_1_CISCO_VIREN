package cisco.java.DAY7_Assignment;

class monkey
{
    void jump()
    {
        System.out.println("JUMPING");
    }
    void bite()
    {
        System.out.println("bite method");
    }
}

interface animal
{
    void eat();
    void sleep();
}

class human extends monkey implements animal
{
    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }
}

public class Assignment3sub2
{
    public static void main(String[] args)
    {
//        monkey m;
//        m= new human();
    }
}
