package cisco.java.programs.co.p1;

public class PClass
{
    public void getDEF()
    {
        System.out.println("d"+new NClass().d);
        System.out.println("e"+new NClass().e);
        System.out.println("f"+new NClass().f);
    }

    public void getABC()
    {
        System.out.println("d"+new MClass().getA());
        System.out.println("e"+new MClass().b);
        System.out.println("f"+new MClass().c);
    }

    public static void main(String[] args)
    {
        PClass newP = new PClass();
        System.out.println("M CLASS");
         newP.getABC();
        System.out.println("N CLASS");
          newP.getDEF();

    }
}
