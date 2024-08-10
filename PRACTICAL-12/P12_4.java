/*
Refine the student manager program to manipulate the student
information from files by using the DataInputStream and
DataOutputStream. Assume suitable data.
*/
import java.io.*;
import java.util.*;
public class P12_4 {
    public static void main(String[] args) throws IOException
    {
        DataInputStream din=new DataInputStream(new FileInputStream("Student.txt"));
        DataOutputStream dout=new DataOutputStream(new FileOutputStream("Student.txt"));
        
                String str="Hello World";
                byte b[]=str.getBytes();
                dout.write(b);
                
                int data;
                while((data=din.read())!=-1)
                {
                    System.out.print((char)data);
                }
               
        din.close();
        dout.close();
    }
}
