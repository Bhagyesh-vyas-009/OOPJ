import java.util.*;
class Palin
{
    public static void main(String[] args)
    {
        int a,b,rv,ri;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        a=sc.nextInt();

        a=b;

        if(a!=0)
        {
            ri=a%10;
            rv=rv*10+ri;
            a=a/10;

           
        }
        
         if(rv==b)
        {
            System.out.print("Number is Palindrome");
        }
        else{
             System.out.print("Number is not Palindrome");
        }

        
    }
}