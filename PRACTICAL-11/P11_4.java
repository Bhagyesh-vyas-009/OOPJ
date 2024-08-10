/*
Create a class called Student. Write a student manager program to
manipulate the student information from files by using FileInputStream
and FileOutputStream.
 */

import java.io.*;
import java.util.*;

class P11_4 {
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        FileOutputStream fout=new FileOutputStream("Student.txt");

        System.out.print("Enter Name :");
        String name=sc.nextLine();
        System.out.print("Enter Enrollment-NO :");
        String enrno=sc.nextLine();
        System.out.print("Enter Sem :");
        String sem=sc.nextLine();
        System.out.print("Enter Course Name :");
        String course=sc.nextLine();

        String info="Name : "+name+"\n"+"Enrollment-No : "+enrno+"\n"+"Sem : "+sem+"\n"+"Course Name : "+course;
        byte b[]=info.getBytes();
        fout.write(b);
        
        FileInputStream fin=new FileInputStream("Student.txt");
        int data=0;
        while((data=fin.read())!=-1)
        {
            System.out.print((char)data);
        }
        fout.close();
        fin.close();

    }
}
