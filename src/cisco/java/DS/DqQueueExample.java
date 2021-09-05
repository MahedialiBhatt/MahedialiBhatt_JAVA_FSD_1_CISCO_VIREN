package cisco.java.DS;

import java.util.ArrayList;
import java.util.List;

public class DqQueueExample
{
    private List<Integer> deque = new ArrayList<Integer>();

    public void insertFront(int item)
    {
        System.out.println("adding at front"+item );
        deque.add(0,item);
        System.out.println(deque);
    }
    public void insertRear(int item)
    {
        System.out.println("adding at rear"+item );
        deque.add(item);
        System.out.println(deque);
    }
    public void removeFront()
    {
        if(deque.isEmpty())
        {
            System.out.println("deque is underflow unable to remove");
            return;
        }

        int n = deque.remove(0);
        System.out.println("removed from front"+n);
        System.out.println(deque);
    }
    public void removeRear()
    {
        if(deque.isEmpty())
        {
            System.out.println("deque is underflow unable to remove");
            return;
        }

        int n = deque.remove(deque.size()-1);
        System.out.println("removed from rear"+n);
        System.out.println(deque);
    }

    public int peakFront()
    {
        int item = deque.get(0);
        System.out.println("element at front"+item);
        return item;
    }
    public int peakRear()
    {
        int item = deque.get(deque.size()-1);
        System.out.println("element at rear"+item);
        return item;
    }

    public static void main(String[] args)
    {
        DqQueueExample dq = new DqQueueExample();

        dq.insertFront(34);
        dq.insertRear(45);
        dq.removeFront();
        dq.removeFront();
        dq.removeFront();
        dq.insertFront(21);
        dq.insertFront(95);
        dq.insertRear(5);
        dq.insertFront(43);
        dq.removeRear();
    }
}
