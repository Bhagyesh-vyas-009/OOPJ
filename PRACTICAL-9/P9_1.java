/*
Write an application that executes two threads. One thread displays
"Good Morning" every 1000 milliseconds & another thread displays
"Good Afternoon" every 3000 milliseconds. Create the threads by
implementing the Runnable interface
*/

class Thread1 implements Runnable
{    
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Good Morning");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

        }
    }
}
class Thread2 implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Good Afternoon");
            try{
                Thread.sleep(3000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class P9_1
{
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        Thread t=new Thread(t1);
        t.start();
        Thread tt=new Thread(t2);
        tt.start();
        
    }
}