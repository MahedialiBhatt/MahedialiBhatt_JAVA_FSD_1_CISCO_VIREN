package cisco.java.methods;
//DAY2 Assignment 1
public class ASSIGNMENT1
{
    public int calculate(int a,int b)
    {
        return a+b;
    }
    public float calculate(float r)
    {
        return(float) 3.14 * r * r;
    }
    public int calculate(int l,int h,int z)
    {
        return l*h;
    }

    public static void main(String args[])
    {
        ASSIGNMENT1 c=new ASSIGNMENT1();
        System.out.println("sum of two value" +c.calculate(10,20));
        System.out.println("area of circle"+ c.calculate(20));
        System.out.println("area of rectangle"+c.calculate(5,10,0));
    }
}
