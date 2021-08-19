package cisco.java.oops;

abstract class Bike
{
    Bike()
    {
        System.out.println("Bike is created");
    }
    abstract void run();
    void changeGear()
    {
        System.out.println("Gear Changed");
    }
}
abstract class Honda extends Bike
{
    Honda()
    {
        System.out.println("Honda is created");
    }
    abstract void run();
    abstract void run1();
}
class Hello extends Honda
{
    void run()
    {
        System.out.println("Running safely...");
    }
    void run1()
    {
        System.out.println("inside run1 method");
    }
}
public class AbstractExample
{
    public static void main(String[] args)
    {
        Honda obj= new Hello();
        obj.run();
        obj.run1();
        obj.changeGear();
    }
}
