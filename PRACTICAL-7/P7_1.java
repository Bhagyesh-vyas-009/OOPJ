/*
The abstract vegetable class has three subclasses named Potato, Brinjal
and Tomato. Write a java program that demonstrates how to establish
this class hierarchy. Declare one instance variable of type String that
indicates the color of a vegetable. Create and display instances of these
objects. Override the toString() method of object to return a string with
the name of vegetable and its color.
*/

abstract class Vegetable
{
    String color;
    void String()
    {

    }

}
class Potato extends Vegetable
{
    Potato()
    {
        color="Brown";
    }
    void String()
    {
        System.out.println("Vegetable name is Potato Color = "+color);
    }
}
class Tomato extends Vegetable
{
    Tomato()
    {
        color="Red";
    }
    void String()
    {
        System.out.println("Vegetable name is Tomato Color = "+color);
    }
}
class Brinjal extends Vegetable
{
    Brinjal()
    {
        color="Purple";
    } 
    void String()
    {
        System.out.println("Vegetable name is Brinjal Color = "+ color);
    }
}


public class P7_1 {

    public static void main(String[] args) {
        Potato p=new Potato();
        p.String();
        Tomato t=new Tomato();
        t.String();
        Brinjal b=new Brinjal();
        b.String();
    }    
}