package cisco.java.programs.co.p2;
import cisco.java.programs.co.p1.*;

public class ZClass
{
    public static void main(String[] args)
    {
        PClass newP= new PClass();
        YClass newY= new YClass();
     System.out.println("NCLASS");
       newP.getDEF();
     System.out.println("MCLASS");
        newP.getABC();
     System.out.println("PCLASS");
        newP.getABC();
        newP.getDEF();
     System.out.println("XCLASS");
         newY.getCLASSX();
    }
}
