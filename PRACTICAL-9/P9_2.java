/*
Write a program to create two threads, one thread will print odd
numbers and second thread will print even numbers between 1 to 20
numbers.
*/

class OddThread extends Thread 
{
    OddThread()
    {
        start();
    }
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenThread extends Thread {
    EvenThread()
    {
        start();
    }
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
public class P9_2 
{
    public static void main(String[] args) {
        OddThread odd = new OddThread();
        EvenThread even = new EvenThread();
    }
}