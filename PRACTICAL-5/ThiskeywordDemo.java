class Cube
{
    static int height;
    int depth,width;

    Cube(int height,int width,int depth)
    {
        this.height=height;
        this.depth=depth;
        this.width=width;

        vol();
    }

    public void vol()
    {
        System.out.println("Volume = "+ (height*width*depth));
    }
}

public class ThiskeywordDemo 
{
    public static void main(String[] args) 
    {
        Cube c=new Cube(5,5,5);
    }
   
}
