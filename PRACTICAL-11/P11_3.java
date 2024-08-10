import java.io.IOException;

/*Write an application that reads a file and counts the number of
occurrences of digit 5. Supply the file name as a command-line
argument.
*/

import java.io.*;
class P11_3 
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fin=new FileInputStream(args[0]);
        int data=0;
        String s="";
        while((data=fin.read())!=-1)
        {
            s+=(char)data;
            // System.out.print((char)data);
        }
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='5')
            {
                count++;
            }
        }
        System.out.println("Occurance of 5 ="+ count);
    }

}
