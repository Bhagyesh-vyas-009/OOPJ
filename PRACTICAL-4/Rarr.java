import java.util.*;
class Rarr
{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter number of elements : ");
        int a[]=new int[sc.nextInt()];
        System.out.println("Enter elements : ");
        for(int i=0;i<a.length;i++)
        {
            
                    a[i]=sc.nextInt();
            
        }
        System.out.print("Array in reverse  order : ");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]);
        }
    }
}