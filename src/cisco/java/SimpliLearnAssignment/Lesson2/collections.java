package cisco.java.SimpliLearnAssignment.Lesson2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class collections
{
    public static void main(String[] args)
    {
        System.out.println("ArrayList");
        ArrayList<String> city = new ArrayList<String>();
        city.add("Bangalore");
        city.add("Delhi");
        System.out.println(city);

        System.out.println("VECTOR");
        Vector<Integer> v = new Vector<Integer>();
        v.add(10);
        v.add(20);
        System.out.println("Vector size : "+v.size());
        System.out.println(v);

        System.out.println("LinkedList");
        LinkedList<String> names = new LinkedList<String>();
        names.add("a");
        names.add("b");
        names.add("c");
        Iterator<String> itr = names.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
