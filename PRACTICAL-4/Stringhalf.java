import java.util.*;
class Stringhalf
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        String s="";
        int i=0;
        s=sc.nextLine();
        try
        {
                while(s.charAt(i)!='\0')
                {
                    i++;
                }
        }
        catch(Exception e)
        {
          //  System.out.print(e);
        }
        finally
        {

        }
        
        System.out.print("Length = "+i);
        int half=i/2;
            System.out.println("Second Half part of string  : ");
        for(int j=half;j<i;j++)
        {
                        System.out.print(s.charAt(j));
        }
    }
}