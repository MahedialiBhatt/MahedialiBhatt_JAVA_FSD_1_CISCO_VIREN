package cisco.java.DAY4_Assignment;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class assignment2
{
    public static void main(String[] argss)
    {
        Scanner sc=new Scanner(System.in);
        LinkedHashSet l1 = new LinkedHashSet();
        LinkedHashSet<Integer> l2 = new LinkedHashSet<Integer>();

        l1.add(1.0);
        l1.add(3.5);
        l1.add(2);
        l1.add(9);
        l1.add('m');
        l1.add('f');
        l1.add(true);
        for(int i=0;i<8;i++)
        {
            l2.add(sc.nextInt());
        }
        System.out.println("L1 "+l1);
        System.out.println("L2 "+l2);
        System.out.println("TREESET.....");
        TreeSet<String> t1 = new TreeSet<String>();
        t1.add("c");
        t1.add("c++");
        t1.add("c#");
        t1.add("java");
        t1.add("js");
        t1.add("python");
        t1.remove("c");
        t1.remove("js");
        System.out.println("Java is in treeset or not "+t1.contains("java") );
        t1.clear();
        System.out.println(t1);
    }
}
