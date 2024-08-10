/*
Write a program that counts number of characters, words, and lines in a
file. Use exceptions to check whether the file that is read exists or not.
*/
import java.io.File;
import java.io.*;
class P11_1
{
    public static void main(String[] args) throws Exception
    {
        File f1=new File("P11_1.txt");
        f1.createNewFile();
        System.out.println(f1.exists()?"File is Exists":"File is not Exists");
        System.out.println(f1.canRead()?"File is Readable":"File is not Readable");
        // Java program to count the 
        // number of lines, words, sentences, 
        // characters, and whitespaces in a file 


		FileInputStream fileInputStream = new FileInputStream(f1); 
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream); 
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader); 

		String line; 
		int wordCount = 0; 
		int characterCount = 0; 

		while ((line = bufferedReader.readLine()) != null) { 
			if (line.equals("")) { 

			} 
			else { 
				characterCount += line.length(); 
				String words[] = line.split("\\s+"); 
				wordCount += words.length; 
				
			} 
		} 
		 
		System.out.println("Total word count = "+ wordCount); 
		System.out.println("Total number of characters = "+ characterCount); 
		

    }
}