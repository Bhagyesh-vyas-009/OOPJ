import java.util.*;
class Grade
{
     public static void main(String[] args)
    {
        int a,b,c,d,e,pr;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter mark 1 :");
        a=sc.nextInt();
        System.out.println("Enter mark 2 :");
        b=sc.nextInt();
        System.out.print("Enter mark 3 :");
        c=sc.nextInt();
        System.out.println("Enter mark 4 :");
        d=sc.nextInt();
        System.out.print("Enter mark 5 :");
        e=sc.nextInt();

        pr=a+b+c+d+e/5;

        if(pr>=90)
        {
            System.out.print("Grade = A");
        }
        else if(pr<=89 && pr>=60)
        {
            System.out.print("Grade = B");
        }
        else if(pr<=45 && pr>=59)
        {
            System.out.print("Grade = C");
        }
        else if(pr>=35 && pr<=45)
        {
            System.out.print("Grade = D");
        }
        else
        {
            System.out.print("Grade = FF");
        }
    }
}