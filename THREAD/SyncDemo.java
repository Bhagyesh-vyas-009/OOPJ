class Product1
{
    int item;
     void put(int item)
    {
        this.item=item;
    }
     void get(int item)
    {
        this.item=item;
    }
}
class Producer1 extends Thread
{
    Product1 p;
    Producer1(Product1 p)
    {
        this.p=p;
        start();
    }
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Produce : "+i);
            p.put(i);
            try
            {
                Thread.sleep(500);
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

}
class Consumer1 extends Thread
{
    Product1 p;
    Consumer1(Product1 p)
    {
        this.p=p;
        start();
    }
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Consume : "+i);
            p.get(i);
            try
            {
                Thread.sleep(500);
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

}

class SyncDemo
{
    public static void main(String[] args) 
    {
        Product1 obj=new Product1();
        Consumer1 c1=new Consumer1(obj);
        Producer1 p1=new Producer1(obj);

    }
}