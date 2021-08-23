package cisco.java.SimpliLearnAssignment.Lesson2;

import java.util.HashMap;
import java.util.Map;

public class map
{
    public static void main(String [] args)
    {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,new String("abc"));
        hm.put(2,new String("def"));
        hm.put(3,new String("xyz"));

        System.out.println("Elements of hashmap are");
         for(Map.Entry m : hm.entrySet())
         {
             System.out.println(m.getKey()+" "+m.getValue());
         }
    }
}
