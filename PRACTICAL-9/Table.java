class TablePrint
{
    synchronized public void printTable(int n)
    {
        try{

            for(int i=1;i<=5;i++)
            {
                System.out.println(i*n);
                Thread.sleep(500);
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class Table5 extends Thread{
    TablePrint t;
    Table5(TablePrint t)
    {
        this.t=t;
        start();
    }
    public void run()
    {
        t.printTable(5);
    }
}
class Table100 extends Thread{
    TablePrint t;
    Table100(TablePrint t)
    {
        this.t=t;
        start();
    }
    public void run()
    {
                t.printTable(100);
    }
}
class Table {
    public static void main(String[] args) {
        TablePrint t=new TablePrint();
        Table5 t5=new Table5(t);
        
        Table100 t100=new Table100(t);
    }    
}
