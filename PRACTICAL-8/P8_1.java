/*
Write a method for computing xy doing repetitive multiplication. X and
y are of type integer and are to be given as command line arguments.
Raise and handle exception(s) for invalid values of x and y.
*/
import java.math.*;
class P8_1
{
    static int Compute(int x,int y)
    {
        return (int)Math.pow(x,y);
    }
    public static void main(String[] args) 
    {
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);   
        
        try
        {
            if(y<0)
            {
                throw new Exception();
            }
            else
            {
                int res=Compute(x, y);
                System.out.println("Power of  x ="+ res);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}