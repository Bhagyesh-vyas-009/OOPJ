import java.util.*;
class Time
{
    int hour,minute;
    Time(int hour,int minute)
    {
        this.hour=hour;
        this.minute=minute;
    }

    public void add(Time t1,Time t2)
    {
        int total_hour=t1.hour+t2.hour;
        int total_min=t1.minute+t2.minute;

        if(total_min>=60)
        {
            total_hour++;
            total_min=total_min-60;
        }

        if(total_hour>=24)
        {
            total_hour=0;
        }

        System.out.print("Total Time = "+total_hour+":"+total_min);
    }
}
public class Timeadd
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter1st time in hour and minute : ");
        Time t1=new Time(sc.nextInt(),sc.nextInt());

        System.out.print("Enter 2nd time in hour and minute : ");
        Time t2=new Time(sc.nextInt(),sc.nextInt());

        t2.add(t1,t2);
        
    }
}
