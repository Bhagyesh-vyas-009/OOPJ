import java.util.*;
class Vowelcount
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        String s="";

        int vc=0;
        int cc=0;
        s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o'  || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O'  || s.charAt(i)=='U')
            {
                vc++;
            }
            else if(s.charAt(i)==' ')
            {
                continue;
            }
            else
            {
                cc++;
            }
        }
        System.out.println("Number of consonants : "+cc);
        System.out.println("Number of vowel  : "+vc);
    }
}