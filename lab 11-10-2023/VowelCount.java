import java.util.*;

class Countvowel
{
public static int a,e,i,o,u;

public static void main(String m[])
{

Scanner in=new Scanner(System.in);
String s=new String();
while(true) 
{
int ta=0,te=0,ti=0,to=0,tu=0;
System.out.println("Enter A line :");
s=in.nextLine();
if(s.equals("quit"))
{
break;
}
else
{
int n=s.length()-1;
for(int x=0;x<=n;x++)
{
switch(s.charAt(x))
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

}
    System.out.println("\n\n In this statement:");
    System.out.println("a comes: "+ta+" times");
    System.out.println("e comes :"+te+" times");
    System.out.println("i comes :"+ti+" times");
    System.out.println("o comes: "+to+" times");
    System.out.println("u comes :"+tu+" times");
}
}
    System.out.println("\n\n Total numbers of the vovels::");
    System.out.println("a comes "+a+" times");
    System.out.println("e comes "+e+" times");
    System.out.println("i comes "+i+" times");
    System.out.println("o comes "+o+" times");
    System.out.println("u comes "+u+" times");
}
}