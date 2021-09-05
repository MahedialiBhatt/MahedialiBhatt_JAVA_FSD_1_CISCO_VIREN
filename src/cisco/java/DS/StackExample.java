package cisco.java.DS;

import java.util.Scanner;
import java.util.Stack;

public class StackExample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<Integer>();


        for(int i=0;i<5;i++)
        {
            st.push(sc.nextInt());
        }
        System.out.println("Stack"+st);
        st.pop();
        st.pop();
        System.out.println("Stack after popping "+st);
        System.out.println("Top Element"+st.peek());
        System.out.println("Search 23 in stack"+st.search(23));
        System.out.println("Search 56 in stack"+st.search(56));

    }
}
