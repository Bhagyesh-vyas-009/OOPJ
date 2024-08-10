import java.util.*;


class Comnum
{
    int real=0,img=0;

    Comnum(int real,int img)
    {
        this.real=real;
        this.img=img;
    }
    public void show()
    {
        System.out.println(this.real + "+" + this.img +" i");
    }
    void add(Comnum c1,Comnum c2)
    {
        System.out.println("Sum = "+(c1.real+c2.real)+ "+" +(c1.img+c2.img)+"i");
    }
}
public class Complexnum 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter real number of first number  : ");
        int real=sc.nextInt();

        System.out.println("Enter img number of first number  : ");
        int img=sc.nextInt();

        Comnum c1=new Comnum(real,img);

        System.out.println("Enter real number of second number  : ");
        int real1=sc.nextInt();

        System.out.println("Enter img number of second number  : ");
        int img1=sc.nextInt();

        Comnum c2=new Comnum(real1,img1);

        c1.add(c1,c2);

        c1.show();

    }    
}
