package cisco.java.DAY5_Assignment;

public class assignment2
{
    public static void main(String[] args)
    {
        String t = "Delhi";
        String o = "Mumbai";
        String k = "delhi";
        String y = new String("Mumbai");
        String l = new String("delhi");
        String p = new String("Hello");

        System.out.println("Number of objects created inside the string bool is : 3 ");
        System.out.println("Number of objects created inside the heap is : 3 ");

        System.out.println(" o equal l "+ o.equals(l));
        System.out.println(" y equal p "+y.equals(p));
        System.out.println(" t equal o "+t.equals(o));
        System.out.println(" k equal y "+k.equals(y));
        System.out.println(" p equal y "+p.equals(y));

        System.out.println(" o == l "+ (o==l));
        System.out.println(" y == p "+ (y==p));
        System.out.println(" t == o "+ (t==o));
        System.out.println(" k == y "+ (k==y));
        System.out.println(" p == y "+ (p==y));
    }
}
