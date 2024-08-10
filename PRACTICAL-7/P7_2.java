/*
Write a program that illustrates interface inheritance. Interface A is
extended by A1 and A2. Interface A12 inherits from both A1 and A2.Each
interface declares one constant and one method. Class B implements
A12.Instantiate B and invoke each of its methods. Each method displays
one of the constants
 */

interface A 
{
    String a="Intreface A";
    public void displayA();
}
interface A1 extends A{
    String a1="Intreface A1";
    public void displayA1();
} 
interface A2 extends A{
    String a2="Intreface A2";
    public void displayA2();
} 
interface A12 extends A1,A2
{
    String a12="Intreface A12";
    public void displayA12();
}

class B implements A12
{
    B()
    {
        displayA();
        displayA1();
        displayA2();
        displayA12();
    }
    public void displayA()
    {
        System.out.println(a);
    }
    public void displayA1()
    {
        System.out.println(a1);
    }
    public void displayA2()
    {
        System.out.println(a2);
    }
    public void displayA12()
    {
        System.out.println(a12);
    }
}
public class P7_2 
{
        public static void main(String[] args) {
            B b=new B();
            
        }
}
