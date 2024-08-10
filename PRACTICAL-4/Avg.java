import java.util.*;
class Avg
{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter number of elements : ");
        int a[]=new int[sc.nextInt()];
        double sum=0;
        double avg=0;
int max=0;
        System.out.println("Enter elements : ");
        for(int i=0;i<a.length;i++)
        {
	 a[i]=sc.nextInt();
            sum=sum+a[i];
            avg=sum/a.length;
max=a[0];
	if(a[i]<=max)
	{
		max=a[i];
	}
           
        }

	        System.out.print("Small = "+max);
        System.out.print("Average = "+avg);
    }
}