package cisco.java.oops;
//DAY3 ASSIGNMENT 1

class Vehicle
{
    public void run()
    {
        System.out.println("Inside run method");
    }

    public void stop()
    {
        System.out.println("Stopped");
    }

    public void fuel(int n)
    {
        System.out.println("fuel method 1");
    }
    public void fuel(float n,String s)
    {
        System.out.println("fuel method 2");
    }
    public void fuel(char c,int n)
    {
        System.out.println("fuel method 2");
    }
    int speed=1;
    long distance=10;
    Vehicle()
    {
        System.out.println("INSIDE VEHICLE DEFAULT CONSTRUCTOR");
    }
    Vehicle(int aa)
    {
        System.out.println("INSIDE VEHICLE PARAMETER CONSTRUCTOR");
    }

    public void display() {

    }
}

class twoW extends Vehicle
{
    twoW()
    {
        System.out.println("INSIDE 2w constructor");
    }
    public void run()
    {
        System.out.println("INSIDE 2w run");
    }
    public void stop()
    {
        System.out.println("INSIDE 2w stop");
    }
    int speed=2;
    long distance=20;
    int nos_of_tyre=2;

    public void display()
    {
        System.out.println("INSIDE 2w VARIABLES"+ "Speed ="+speed +"distance = "+ distance +" nos_of_tyre = "+nos_of_tyre);
        System.out.println("INSIDE 2w and Printing Parent variables");
        System.out.println("Speed PARENT"+ super.speed);
        System.out.println("Distance PARENT"+ super.distance);
    }
}
class threeW extends Vehicle
{
    public void run()
    {
        System.out.println("INSIDE 3w run");
    }
    public void stop()
    {
        System.out.println("INSIDE 3w stop");
    }
    int speed=3;
    long distance=30;
    int nos_of_tyre=3;

    threeW()
    {
        System.out.println("INSIDE 3w constructor");
    }

    public void display()
    {
        System.out.println("INSIDE 3w VARIABLES"+ "Speed ="+speed +"distance = "+ distance +" nos_of_tyre = "+nos_of_tyre);
        System.out.println("INSIDE 3w and Printing Parent variables");
        System.out.println("Speed PARENT"+ super.speed);
        System.out.println("Distance PARENT"+ super.distance);
    }

}
class fourW extends Vehicle
{
    public void run()
    {
        System.out.println("INSIDE 4w run");
    }
    public void stop()
    {
        System.out.println("INSIDE 4w stop");
    }
    int speed=4;
    long distance=40;
    int nos_of_tyre=4;

    fourW()
    {
        System.out.println("INSIDE 4w constructor");
    }

    public void display()
    {
        System.out.println("INSIDE 4w VARIABLES"+ "Speed ="+speed +"distance = "+ distance +" nos_of_tyre = "+nos_of_tyre);
        System.out.println("INSIDE 4w and Printing Parent variables");
        System.out.println("Speed PARENT"+ super.speed);
        System.out.println("Distance PARENT"+ super.distance);
    }

}
class eightW extends Vehicle
{
    public void run()
    {
        System.out.println("INSIDE 8w run");
    }
    public void stop()
    {
        System.out.println("INSIDE 8w stop");
    }
    int speed=4;
    long distance=80;
    int nos_of_tyre=8;

    eightW()
    {
        System.out.println("INSIDE 8w constructor");
    }

    public void display()
    {
        System.out.println("INSIDE 8w VARIABLES"+ "Speed ="+speed +" distance = "+ distance +" nos_of_tyre = "+nos_of_tyre);
        System.out.println("INSIDE 8w and Printing Parent variables");
        System.out.println("Speed PARENT"+ super.speed);
        System.out.println("Distance PARENT"+ super.distance);
    }
}

public class assignment
{
    public static void main(String [] args)
    {
        System.out.println("----------------------------------------\n");

        Vehicle vehicle= new Vehicle();
         vehicle.run();
         vehicle.stop();

         System.out.println("----------------------------------------\n");

        Vehicle tw=new twoW();
           tw.run();
           tw.stop();
           tw.display();

        System.out.println("----------------------------------------\n");

        Vehicle threew=new threeW();
           threew.run();
           threew.stop();
           threew.display();

        System.out.println("----------------------------------------\n");

        Vehicle fw=new fourW();
           fw.run();
           fw.stop();
           fw.display();

        System.out.println("----------------------------------------\n");

        Vehicle ew=new eightW();
           ew.run();
           ew.stop();
           ew.display();
    }
}
