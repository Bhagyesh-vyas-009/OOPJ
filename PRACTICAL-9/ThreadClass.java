
class Thread1 extends Thread
{
    Thread1()
    {
        super("Thread 1");
        start();
    }
    synchronized public void run()
    {
        try{
            for(int i=0;i<5;i++)
            {
                System.out.println("Thread 1");
                Thread.sleep(500);
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class Thread2 extends Thread{
    Thread2()
    {
        start();
    }
    synchronized public void run()
    {
        try{
            for(int i=0;i<5;i++)
            {
                System.out.println("Thread 2");
                Thread.sleep(500);
            }
            }    catch(Exception e)
            {
                System.out.println(e);
            }
        
    }
}
class  ThreadClass {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
    }    
}
