package cisco.java.programs;

public class TypecastExample
{
    public static void main(String[] args)
    {
        //int and long -- start
        int i=100;
        long l=i;
        System.out.println("long value "+l);

        int o=(int) l;
        System.out.println("int value "+o);

        char t=(char) i;
        System.out.println("char value "+ t);

        //DOUBLE AND FLOAT
        double d = 1990239089127389.1729123;
        float r=(float) d;
        System.out.println("float value "+ r);
        System.out.println("double value "+ d);

        //DOUBLE->LONG->INT
        double d2=100.04;
        long l2=(long) d2;
        int i2=(int)l2;
        System.out.println("double value "+ d2);
        System.out.println("long value "+ l2);
        System.out.println("int value "+ i2);

        // LONG and FLOAT
        float f=l;
        System.out.println("float value "+ f);

        //BYTE INT DOUBLE
        byte b;
        int ii=257;
        double dd=323.142;

        System.out.println("conversion of int to byte.");
        b=(byte) ii;   //i%256
        System.out.println("ii = " + ii + " b = " + b);

        System.out.println("\nConversion of double to byte.");

        b = (byte) dd; //d%256
        System.out.println("dd = " + dd + " b= " + b);
    }
}
