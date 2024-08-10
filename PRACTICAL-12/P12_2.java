/*
Write a program to check that whether the name given from command
line is file or not? If it is a file then print the size of file and if it is directory
then it should display the name of all files in it.
*/
import java.io.File;
class P12_2
{
    public static void main(String[] args) 
    {
        String fname=args[0];
        File f1=new File(fname);
        if(f1.isFile())
        {
            System.out.print("Size of File is : "+f1.length()+" Bytes");
        }

        else if(f1.isDirectory())
        {
            System.out.println("Directory of "+fname);
            String s[]=f1.list();
            for(int i=0;i<s.length;i++)
            {
                File f=new File(fname + "/" + s[i] );
                if(f.isDirectory())
                {
                    System.out.print(s[i]+"is directory");
                }
                else
                {
                    System.out.println(s[i] + " is File");
                }
            }
        }

    }
}