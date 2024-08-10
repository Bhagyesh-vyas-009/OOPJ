/* 
Refine the student manager program to manipulate the student
information from files by using the BufferedReader and BufferedWriter.
 */
import java.io.*;
class P12_1 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader breader=new BufferedReader(new FileReader("file1.txt"));
        BufferedWriter bwriter=new BufferedWriter(new FileWriter("file1.txt"));

        int data=0;

        while(data!=-1)
        {
            breader.read();
            if(Character.isUpperCase((char)data))
            {
                bwriter.write(Character.isLowerCase((char)data));
            }
        }
    }
}
