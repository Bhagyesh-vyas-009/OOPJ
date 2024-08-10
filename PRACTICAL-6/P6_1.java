import java.util.Scanner;

class Student
{
    int id;
    int no_of_subjects;
    int[]  subject_code;
    int[] subject_credits;
    int[] grade_obtained;
    double spi;

    Student(int id,int no_of_subjects)
    {
        Scanner sc=new Scanner(System.in);

        this.id=id;
        this.no_of_subjects=no_of_subjects;
        subject_credits=new int[no_of_subjects];
        subject_code=new int[no_of_subjects];
        grade_obtained=new int[no_of_subjects];



        System.out.println("Enter subject code : ");
        for(int j=0;j<subject_code.length;j++)
        {
            subject_code[j]=sc.nextInt();
        }
        System.out.println("Enter subject credit : ");
        for(int j=0;j<subject_credits.length;j++)
        {
            subject_credits[j]=sc.nextInt();
        }
        System.out.println("Enter subject grades : ");
        for(int j=0; j<grade_obtained.length; j++)
        {
            grade_obtained[j]=sc.nextInt();
        }
     
        
    }

    // void spi()
    // {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter Spi : ");
    //     int spi=sc.nextInt();
    //     System.out.println(spi);
    // }

    void calculate_spi()
    {
        int totalcredit=0;   
        int totalweight=0;
        for(int i=0;i<subject_credits.length;i++)
        {
            
            totalcredit+=subject_credits[i];   
            
        }

        for (int i = 0; i < grade_obtained.length; i++) 
        {
            
            totalweight+=subject_credits[i]*grade_obtained[i];    
        }

        int spi=0;
        spi+=totalweight/totalcredit;
        System.out.println("SPI = "+spi);

    } 

}

class P6_1
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int id;
        int no_of_subjects;
        
        Student[] s=new Student[Integer.parseInt(args[0])];

        for(int i=0;i<s.length;i++)
        {
            System.out.println("Enter id of Student : ");
            id=sc.nextInt();
            System.out.println("Enter no of Subjects : ");
            no_of_subjects=sc.nextInt();
            s[i]=new Student(id,no_of_subjects);

            s[i].calculate_spi();

        }
    }
}