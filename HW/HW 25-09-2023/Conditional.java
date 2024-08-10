import java.util.*;

class Conditional
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n1 : ");
        int a=sc.nextInt();
        System.out.print("Enter n2 : ");
        int b=sc.nextInt();
        System.out.print("Enter n3 : ");
        int c=sc.nextInt();

     
        System.out.println((a>b?"a"+a:((b>c)?"b"+b:"c"+c)));
    }
}