class Outer
{
    static private int a=10;
    static void methOut()
    {
        System.out.println("Inside Meth Out a = "+a);
        
        Inner.methIn();
    }
    class Inner
    {
        static int b=30;
        static void methIn()
        {
            System.out.println("Inside Meth In");
            System.out.println("a+b = "+(a+b));
        }

    }
}
class NestedClass
{
    public static void main(String[] args) 
    {
        Outer o=new Outer();
        o.methOut();
    }
}