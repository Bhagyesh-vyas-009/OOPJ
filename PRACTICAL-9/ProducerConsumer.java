class Product
{
    int item;
    synchronized void put(int item)
    {
        this.item=item;
         System.out.println("Produced : "+item);
    }
    synchronized void get(int item)
    {
        this.item=item;
        System.out.println("Cosumed : "+item);
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
           for(int i=0;i<5;i++)
           {
                p.put(i);
                Thread.sleep(500);
           } 
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
           for(int i=0;i<5;i++)
           {
                p.get(i);
                Thread.sleep(500);
           } 
        }catch(Exception e)
        {
            System.out.println(e);
        }
   }
}

class ProducerConsumer {
    public static void main(String[] args) {
        Product p1=new Product();
        Producer pr=new Producer(p1);
        Consumer c=new Consumer(p1);
    
    }
}
