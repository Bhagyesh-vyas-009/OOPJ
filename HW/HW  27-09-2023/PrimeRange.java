import java.util.*;

class PrimeFunction1
{
    void pfunction1(int n)
    {
        boolean flag=false;

        for(int i=2;i<=n/2;i++)
        {
            if(n%i == 0)
            {
                System.out.print(n+" is Composite");
                flag=true;
                break;
               
            }         
            else
            {
                flag=false;
            }
            
        }
        if(flag==false)
        {
            System.out.print(n+" is Prime");
        }
        
    }
}

public class PrimeRange
{
    public static void main(String[] args) 
    {
        
        PrimeFunction1 p=new PrimeFunction1();

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter start range : ");

        int r1=sc.nextInt();


        System.out.print("Enter end range : ");

        int r2=sc.nextInt();

        

        for(int i=r1;i<=r2;i++)
        {
            
            p.pfunction1(i);
        }

    }
   

}
