package cisco.java.oops;
//DAY3 assignment 2

abstract class MNC
{
    abstract void m1();
    abstract void m2();
    MNC()
    {
        System.out.println("MNC CONSTRUCTOR");
    }
    void NormalMethod()
    {
        System.out.println("MNC NORMAL METHOD");
    }
}

abstract class Infosys extends MNC
{
    void m1()
    {
        System.out.println(" m1 Implemented inside Infosys class");
    }
}

class Hello1 extends Infosys
{
    void m2() {
        System.out.println(" m2 Implemented inside HELLO class");
    }

    void normal()
    {
        System.out.println("Normal method in HELLO");
    }
}

public class assignment2
{
    public static void main(String[] args)
    {
        System.out.println("MNC>>>>>>\n");
           MNC c1 =new Hello1();
            c1.m1();
            c1.m2();
            c1.NormalMethod();
        System.out.println("INFOSYS>>>>>>\n");
           Infosys c2 =new Hello1();
            c2.m1();
            c2.m2();
            c2.NormalMethod();
        System.out.println("HELLO>>>>>>\n");
           Hello1 c3 =new Hello1();
            c3.m1();
            c3.m2();
            c3.normal();
            c3.NormalMethod();
    }
}
