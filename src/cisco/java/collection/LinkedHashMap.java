package cisco.java.collection;

import java.util.Map;

public class LinkedHashMap
{
    public static void main(String [] args)
    {
        Map<Integer,String> linkedHashMap = new java.util.LinkedHashMap<Integer, String>();

        linkedHashMap.put(1, new String("Samsung"));
        linkedHashMap.put(2, new String("Apple"));
        linkedHashMap.put(3, new String("MI"));
        linkedHashMap.put(4, new String("HCL"));
        linkedHashMap.put(5, new String("Wipro"));

        System.out.println("Contents of LinkedHashMap : " + linkedHashMap);
        System.out.println("\n Values of map after iterating over it : ");

        for(Integer key : linkedHashMap.keySet())
        {
            System.out.println(key + ":\t" + linkedHashMap.get(key));
        }

        System.out.println("\nThe size of the LinkedHashMap is " + linkedHashMap.size());
        System.out.println("\nIs linkedHashMap empty? : " + linkedHashMap.isEmpty());
        System.out.println("\nLinkedHashMap contains 2 as key? " + linkedHashMap.containsKey(2));
        System.out.println("\nThe size of the LinkedHashMap contains HCL as value? " + linkedHashMap.containsValue("HCL"));
        System.out.println("\nRemove entry for key 3 " + linkedHashMap.remove(3));
        System.out.println("\nContent of LinkedHashMap after removing key 2: " + linkedHashMap);

        linkedHashMap.clear();
        System.out.println("\nThe size of the LinkedHashMap is " + linkedHashMap.size());
    }
}
