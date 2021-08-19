package cisco.java.oops.inheritance;

public class Hierarchical
{
    class Animal
    {
        public void eat()
        {
            System.out.println("eating...");
        }
    }
    class Dog extends Animal
    {
        void bark()
        {System.out.println("barking....");}
    }

    class Cat extends Animal
    {
        void meow()
        {
            System.out.println("meow...");
        }
    }

    public static void main(String[] args)
    {

    }
}
