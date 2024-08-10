import java.util.*;

class Game
{
    void play()
    {
        System.out.println("Inside Game class");
    }
}

class Cricket extends Game
{
    void play()
    {
        System.out.println("Welcome to Cricket");
    }
}
class Football extends Game
{
    void play()
    {
        System.out.println("Welcome to Football");
    }
}
class Chess extends Game
{
    void play()
    {
        System.out.println("Welcome to Chess");
    }
}

class DynamicMethodDispatch
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Which game you want to play \n Cricket \n Football \n Chess ");
        System.out.println("Enter Game Name :");
        String gname=sc.next();

        Game g;
        if(gname.equals("Cricket"))
        {
            g=new Cricket();
            g.play();
        }
        else if(gname.equals("Football"))
        {
            g=new Football();
            g.play();
        }
        else if(gname.equals("Chess"))
        {
            g=new Chess();
            g.play();
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}