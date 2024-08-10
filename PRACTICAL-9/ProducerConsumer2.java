class Product
{
    int item;
    synchronized void put()
    {
        this.item=item;
        try{
            for(int i=0;i<5;i++)
            {
                System.out.println("Produced : "+i);
                Thread.sleep(500);
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    synchronized void get()
    {
        this.item=item;
        try{
            for(int i=0;i<5;i++)
            {
                System.out.println("Cosumed : "+i);
                Thread.sleep(500);
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class Producer extends Thread
{
    Product p;
    Producer(Product p)
    {
        this.p=p;
        start();
    }
   public void run()
   {
        try{
                p.put();
                Thread.sleep(500);
        }catch(Exception e)
        {
            System.out.println(e);
        }
   }
}

class Consumer extends Thread
{
    Product p;
    Consumer(Product p)
    {
        this.p=p;
        start();
    }
   public void run()
   {
        try{
              p.get();
                Thread.sleep(500);
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
   }
}

class ProducerConsumer2 {
    public static void main(String[] args) {
        Product p1=new Product();
        Producer pr=new Producer(p1);
        Consumer c=new Consumer(p1);
    
    }
}
