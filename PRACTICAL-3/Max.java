import java.util.*;
class Max
{
    public static void main(String[] args)
    {
    int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n1:");
        a=sc.nextInt();
        System.out.println("Enter n2 :");
        b=sc.nextInt();
        System.out.print("Enter n3 :");
        c=sc.nextInt();

       /* if(a>b && a>c)
        {
            System.out.print("Max =" +a);
        }
        else if(b>a && b>c)
        {
            System.out.print("Max =" +b);
        }
        else
        {
            System.out.print("Max =" +c);
        }*/

	System.out.print(a>b&&a>c?"A is max":(b>c?"B is max":"C is max"));
    }     
}