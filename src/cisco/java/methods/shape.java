package cisco.java.methods;
//DAY2 Assignment 2
public class shape
{
    int l=1,b=1,h=1;
    float pi;
    shape()
    {
        l=1;
        b=1;
        h=1;
    }
    shape(int l)
    {
        this.l=l;
        System.out.println("Area of square"+displaySQ());
    }
    shape(int l,int h)
    {
        this.l=l;
        this.h=h;
        System.out.println("Area of rectangle"+displayREC());
    }
    shape( float pi,int l)
    {
        this.l=l;
        this.pi=pi;
        System.out.println("Area of circle"+displayCIR());
    }
     int displaySQ()
    {
         return l*l;
    }
    int displayREC()
    {
       return l*h;
    }
    float displayCIR()
    {
         return pi*l*l;
    }
    public double area(double b,double h)
    {
        return 0.5*b*h;
    }
    public double area(double c,double d1,double d2)
    {
         return 0.5*d1*d2;
    }
    public static void main(String[] args)
    {
          shape s=new shape();
          System.out.println("Area of rhombus"+s.area(0.5,40,25));
          System.out.println("Area of triangle"+s.area(40,20));

          shape ss;
          ss=new shape(10);
          ss=new shape(10,20);
          ss=new shape(3.14f,15);
    }
}
