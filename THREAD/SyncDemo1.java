class Product1
{
    int item;
     void put(int item)
    {
        // this.item=item;
            System.out.println("Produced : "+item);
            try{
                Thread.sleep(500);
            }catch(Exception e)
            {
                System.out.println(e);
            }
    }
     void get(int item)
    {
        // this.item=item;
        
            System.out.println("Consumed : "+item);
            try{
                Thread.sleep(500);
            }catch(Exception e)
            {
                System.out.println(e);
            }
        
    }
}
class Producer1 extends Thread
{
    Product1 p;
    Thread t;
    Producer1(Product1 p)
    {
        this.p=p;
        start();
    }
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            p.put(i);
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
            p.get(i);
        }
            
    }

}

class SyncDemo1
{
    public static void main(String[] args) 
    {
        Product1 obj=new Product1();
        Consumer1 c1=new Consumer1(obj);
        Producer1 p1=new Producer1(obj);

    }
}