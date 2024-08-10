/*
Write a program to replace all “word1” by “word2” from a file1, and
output is written to file2 file and display the no. of replacement.
*/

import java.io.*;
public class P11_2 
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fin=new FileInputStream("file1.txt");   

        int data=0;
        String s="";
        while((data=fin.read())!=-1)
        {
            s+=(char)data;   
            // System.out.print((char)data);
        }
        String newtext=s.replace("Darshan", "AVPTI");
        FileOutputStream fout=new FileOutputStream("file2.txt");
        byte b[]=newtext.getBytes();
        int count=0;
        for(int i=0;i<newtext.length();i++)
        {
            if(s.charAt(i)=='D')
            {
                count++;
            }
        }
        System.out.println(count);
        fout.write(b);
        fin.close();
        fout.close();


    }
}
