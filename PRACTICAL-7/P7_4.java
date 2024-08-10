/*
Create interface EventListener with performEvent() method. Create
MouseListener interface which inherits EventListener along with
mouseClicked(), mousePressed(), mouseReleased(), mouseMoved(),
mouseDragged() methods. Also create KeyListener interface which
inherits EventListener along with keyPressed(), keyReleased() methods.
WAP to create EventDemo class which implements MouseListener and
KeyListener and demonstrate all the methods of the interfaces.
*/

interface EventListener
{
    public void performEvent();
}
interface MouseListener extends EventListener
{
    public void mouseClicked();
    public void mousePressed();
    public void mouseReleased();
    public void mouseMoved();
    public void mouseDragged();
}
interface KeyListener extends EventListener
{
    public void keyPressed();
    public void keyReleased();
}

class EventDemo implements MouseListener,KeyListener
{
    public void performEvent()
    {
        mouseClicked();
        mousePressed();
        mouseReleased();
        mouseMoved();
        mouseDragged();
        keyPressed();
        keyReleased();
    }
    public void mouseClicked()
    {
        System.out.println("MouseClicked");
    }
    public void mousePressed(){
        System.out.println("MousePressed");
    }
    public void mouseReleased(){
        System.out.println("MouseReleased");
    }
    public void mouseMoved()
    {
        System.out.println("MouseMoved");
    }
    public void mouseDragged(){
        System.out.println("MouseDragged");
    }
    
    public void keyPressed(){
        System.out.println("KeyPressed");
    }
    public void keyReleased(){
        System.out.println("KeyReleased");
    }
}


public class P7_4 {
    public static void main(String[] args) {
        EventDemo ed=new EventDemo();
        ed.performEvent();
    }
}
