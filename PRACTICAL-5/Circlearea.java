import java.util.*;
class Area
{
    double r;

    public Area(double r)
    {
        this.r=r;
    }

    double area()
    {
        return 3.14*r*r;
    }
}

class Circlearea
{
    public static void main(String[] args) 
    {
        Scanner sc=  new Scanner(System.in);

        System.out.println("Enter Radius : ");
        double r=sc.nextDouble();

        Area c=new Area(r);

        double a= c.area();

        System.out.println("Area = "+a);



    }
}

