import java.util.*;

public class StringDemo 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s1;
        String s2="";
        String s3="Darshan";
        String s4="Hello World";
        String rev="";
        String rev5="";
        String s5;
        System.out.println("Enter String : ");
        s5=sc.next();

        System.out.println("String s3 = "+s3);

        for(int i=0;i<s3.length();i++)
        {
            System.out.println("s3.charAt("+i+") : "+s3.charAt(i));
        }

        for(int i=s4.length()-1;i>=0;i--)
        {
            rev+=s4.charAt(i);

        }

        for(int i=s5.length()-1;i>=0;i--)
        {
            rev5 += s5.charAt(i);

        }

        System.out.println("Reverse of String s4 = "+rev);

        System.out.println("Reverse of Entered String = "+rev5);
    }    
}
