import java.util.*;

class StaticCount
{
    static int count=0;

    StaticCount()
    {
        count++;
        System.out.println("Count = "+count);
    }
}
class ObjectCount
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);    


        
        // StaticCount o1=new StaticCount();
        // StaticCount o2=new StaticCount();
        // StaticCount o3=new StaticCount();
        // StaticCount o4=new StaticCount();
        // StaticCount o5=new StaticCount();

        System.out.println("Enter number of objects : ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            new StaticCount();
        }

        System.out.println("Object Count = "+StaticCount.count);
        
    }
}