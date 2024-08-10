import java.util.*;

class ContinueDemo
{
    public static void main(String[] args) 
    {
    
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter numbers : ");
        
        int sum=0;
 	int n=sc.nextInt();
        while(true)
        {
           n=sc.nextInt();
            if(n<0)
            {
                   continue;      
            }

	   sum+=n;
	System.out.println("\nSum = "+sum);
        }
	  
    }

}