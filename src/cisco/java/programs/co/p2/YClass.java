package cisco.java.programs.co.p2;
import cisco.java.programs.co.p1.*;

public class YClass
{
    public void getCLASSX()
    {
        System.out.println("G"+new XClass().getG());
        System.out.println("H"+new XClass().h);
        System.out.println("I"+new XClass().i);
        System.out.println("J"+new XClass().j);
    }
    public static void main(String[] args) {
        PClass newP = new PClass();
        YClass newY = new YClass();
        System.out.println("N CLASS........");
         newP.getDEF();
        //System.out.println("E" + new NClass().e);

        System.out.println("M CLASS........");
        newP.getABC();

        System.out.println("X CLASS........");
          newY.getCLASSX();

    }
}

