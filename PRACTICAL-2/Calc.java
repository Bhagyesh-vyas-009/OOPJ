import java.util.*;
class Calc
{
    public static void main(String[] args)
    {
        int a,b,ch;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num 1 :");
        a=sc.nextInt();
        System.out.println("Enter num 2 :");
        b=sc.nextInt();
      
        System.out.println("1 = Addition ");
        System.out.println("2 = Subtraction ");
        System.out.println("3 = Multiplication ");
        System.out.println("4 = Division");
        System.out.println("Enter Choice :");
        ch=sc.nextInt();

        switch(ch)
        {
            case 1:
                  System.out.println("Additon = "+(a+b));
                  break;
            case 2:
                  System.out.println("Subtraction = "+(a-b));
                  break;
            case 3:
                  System.out.println("Multiplication= "+(a*b));
                  break;
            case 4:
                  System.out.println("Division= "+(a/b));
                  break;
        }
    }
}