package cisco.java.DAY5_Assignment;

import java.util.PriorityQueue;

public class assignment1
{
    public static void main(String[] args)
    {
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("India");
        pq.add("America");
        pq.add("Japan");
        pq.add("Bangladesh");
        pq.add("China");
        pq.add("Korea");
        pq.add("Vietnam");

        System.out.println("PQ element - "+pq);

        pq.remove("Korea");
        pq.poll();

        System.out.println("PQ element after removing"+pq);

        pq.add("Pakistan");
        pq.add("Russia");

        System.out.println("Peek element - "+pq.peek());

        System.out.println("PQ final element - "+pq);

    }
}
