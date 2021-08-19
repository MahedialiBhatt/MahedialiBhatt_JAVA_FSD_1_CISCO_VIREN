package cisco.java.oops;

class Bank
{
    float getRateOfInterest()
    {
        return 0;
    }
}

class SBI extends Bank
{
    float getRateOfInterest()
    {
        return 8.4f;
    }
}

class ICICI extends Bank
{
    float getRateOfInterest()
    {
        return 7.3f;
    }
}
class AXIS extends Bank
{
    float getRateOfInterest()
    {
        return 9.7f;
    }
}

public class RuntimePolymorphism
{
    public static void main(String[] args)
    {
        Bank b;

        b=new SBI();
        System.out.println("SBI RateOfInterest"+ b.getRateOfInterest());

        b=new ICICI();
        System.out.println("ICICI RateOfInterest"+ b.getRateOfInterest());

        b=new AXIS();
        System.out.println("AXIS RateOfInterest"+ b.getRateOfInterest());
    }
}
