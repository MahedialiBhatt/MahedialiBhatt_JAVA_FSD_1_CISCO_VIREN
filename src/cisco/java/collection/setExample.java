package cisco.java.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class setExample
{
    public static void main(String[] args)
    {
        LinkedHashSet<String> ls=new LinkedHashSet<>();
        HashSet<String> hs = new HashSet<>();
        TreeSet<String> ts = new TreeSet<>();

        ls.add("d");
        ls.add("j");
        ls.add("true");
        ls.add("45");
        ls.add("b");
        ls.add("a");
        ls.add("c");
        ls.add("i");
        ls.add("l");

        hs.add("apple");
        hs.add("orange");
        hs.add("cherry");
        hs.add("banana");

        ts.add("india");
        ts.add("america");
        ts.add("canada");
        ts.add("australia");
        ts.add("japan");
        System.out.println("-------------------------");
        System.out.println("LinkeHashSet\n"+ls);
            System.out.println("Size "+ls.size());
            System.out.println("contain "+ls.contains("l"));
            System.out.println("removing "+ls.remove("c"));
            System.out.println("isEmpty "+ls.isEmpty());
            System.out.println("clearing ");ls.clear();
            System.out.println(ls);
        System.out.println("-------------------------");
        System.out.println("HashSet\n"+hs);
            System.out.println("Size "+hs.size());
            System.out.println("contain "+hs.contains("pineaple"));
            System.out.println("removing "+hs.remove("banana"));
            System.out.println("isEmpty "+hs.isEmpty());
            System.out.println("clearing ");hs.clear();
            System.out.println(hs);
        System.out.println("-------------------------");
        System.out.println("TreeSet\n"+ts);
            System.out.println("Size "+ts.size());
            System.out.println("contain "+ts.contains("india"));
            System.out.println("removing "+ts.remove("america"));
            System.out.println("isEmpty "+ts.isEmpty());
            System.out.println("clearing ");ts.clear();
            System.out.println(ts);
        System.out.println("-------------------------");
    }
}
