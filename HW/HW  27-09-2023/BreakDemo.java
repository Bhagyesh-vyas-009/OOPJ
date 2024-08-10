import java.util.*;

public class BreakDemo 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter positive numbers : ");
        int sum=0;
            int n=sc.nextInt();
        while(n>0)
        {
            
            if(n<0)
            {
                break;
                
            }
n=sc.nextInt();
            sum+=n;
        System.out.print("Sum = "+sum);

           
        }
        System.out.print("Sum = "+sum);
        
    }
}
