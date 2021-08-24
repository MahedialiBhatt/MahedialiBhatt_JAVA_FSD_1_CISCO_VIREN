package cisco.java.Thread;

import static java.lang.Thread.MAX_PRIORITY;

public class RunnableExample implements Runnable
{
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName()+"  :"+ i);
        }
    }
    public static void main(String [] args)
    {
        RunnableExample m1 = new RunnableExample();
        Thread t1 = new Thread(m1);

        RunnableExample m2 = new RunnableExample();
        Thread t2 = new Thread(m2);

        RunnableExample m3 = new RunnableExample();
        Thread t3 = new Thread(m3);

        RunnableExample m4 = new RunnableExample();
        Thread t4 = new Thread(m4);

        t1.setName("Java");
        //t1.setPriority(MAX_PRIORITY);

        t2.setName("PYTHON");
        t2.setPriority(MAX_PRIORITY);

        t3.setName("C++");


        t4.setName("GO");


        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println(t3.getState());
        System.out.println(t4.getState());

    }
}
