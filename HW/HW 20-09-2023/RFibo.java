import java.util.*;
class RFibo
{
    static int n1=0,n2=1,n3=0;
    public static void printseries(int count)
    {
        if(count>0)
        {
            n1=n2;
            n2=n3;

            n3=n1+n2;
            
            System.out.print(" "+n3);

            printseries(count-1);
        }


    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int count;
        System.out.println("Enter count : ");
        count=sc.nextInt();

        System.out.print(n1+" "+n2);

        printseries(count-2);
    }
}