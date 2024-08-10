import java.util.*;
class Cel
{
    public static void main(String[] args)
    {
        int f,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Temprature:");
        f=sc.nextInt();
        c=f-32*5/9;
        System.out.print("Calcuis ="+c);
    }
}