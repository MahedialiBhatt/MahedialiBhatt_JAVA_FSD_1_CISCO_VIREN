package cisco.java.methods;

public class MethodOverload
{
    public void area(int b,int h)
    {
        System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(long r)
    {
        System.out.println("Area of CIrcle : "+(3.14*r*r));
    }
    public void area(float g,int c)
    {
        System.out.println("printing the value : "+ g + "---" +c);
    }
    public void area(int h, float g, char m)
    {
        System.out.println("printing the value h "+h +"---g " + g + "---m"+m);
    }
    public static void main(String args[])
    {
        MethodOverload ob = new MethodOverload();
        ob.area(10.0f,12);
        ob.area(5);
    }
}
