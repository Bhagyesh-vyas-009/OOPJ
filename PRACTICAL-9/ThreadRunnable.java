class Threadr1 implements Runnable{
    public void run()
    {
        try{
            for(int i=0;i<5;i++)
            {
                System.out.println("Thread Runnable 1");
                Thread.sleep(500);
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class Threadr2 implements Runnable{
    Threadr2()
    {
        Thread t=new Thread();
        t.start();
    }
    public void run()
    {
        try{
            for(int i=0;i<5;i++)
            {
                System.out.println("Thread Runnable 2");
                Thread.sleep(500);
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public class ThreadRunnable {
    public static void main(String[] args) {
        Threadr1 tr1=new Threadr1();
        Thread t=new Thread(tr1);
        t.start();
        Threadr2 tr2=new Threadr2();
        Thread t2=new Thread(tr2);
        t2.start();
    }
}
