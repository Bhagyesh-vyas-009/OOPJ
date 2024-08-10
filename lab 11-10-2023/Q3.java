import java.util.*;

class Vowel
{
    String r;
    public static int a,e,i,o,u;
    int ta,te,ti,to,tu;
    Vowel(String s)
    {
        r=s;
    }
    void count()
    {
        int x=0;
        switch(r.charAt(x))
        {
            case 'a' : case 'A' :
                a++; 
                ta++; 
                break;
            case 'e' : case 'E' : e++; te++;break;
            case 'i' : case 'I' : i++;  ti++; break;
            case 'o' : case 'O' : o++; to++; break;
            case 'u' : case 'U' : u++; tu++; break;
        }

        System.out.println("\n\n In this statement:");
    System.out.println("a comes: "+ta+" times");
    System.out.println("e comes :"+te+" times");
    System.out.println("i comes :"+ti+" times");
    System.out.println("o comes: "+to+" times");
    System.out.println("u comes :"+tu+" times");

    System.out.println("\n\n Total numbers of the vovels::");
    System.out.println("a comes "+a+" times");
    System.out.println("e comes "+e+" times");
    System.out.println("i comes "+i+" times");
    System.out.println("o comes "+o+" times");
    System.out.println("u comes "+u+" times");

        // if(r.charAt(i)=='a' && r.charAt(i)=='e' && r.charAt(i)=='i' && r.charAt(i)=='o'&& r.charAt(i)=='u' && r.charAt(i)=='A' && r.charAt(i)=='E' && r.charAt(i)=='I' && r.charAt(i)=='O'&& r.charAt(i)=='U')
        // {
        //     count++;
        //     System.out.println(count);
        // }
    }
    void display()
    {

    }
}
public class Q3 
{
    public static void main(String[] args) 
    {
        int ta=0,te=0,ti=0,to=0,tu=0;
      Scanner sc=new Scanner(System.in); 
       
      Vowel v=new Vowel();
      System.out.println("Enter Sentence : ");
        String s;
      
        s=sc.next();

      
    
      while(true)
      {
            
          if(s.equals("quit"))
          {
              break;
          }
          else
          {
            int n=s.length()-1;
        for(int x=0;x<=n;x++)
        {
            v.count();
            v.display();

        }

          }
      }


    }
}
