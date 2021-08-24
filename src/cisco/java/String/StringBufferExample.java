package cisco.java.String;

public class StringBufferExample
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java");
        System.out.println(sb);

        sb.insert(1,"CORE");
        System.out.println(sb);

        sb.replace(1,3,"JAVA");
        System.out.println(sb);

        sb.delete(1,3);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.charAt(4));

        StringBuilder s= new StringBuilder("CORE");

        System.out.println("----------"+s);
        s.append(" java");
        System.out.println("----------"+s);
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.reverse());

    }
}
