import java.util.*;

public class Matrixmulti 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        int n;

        System.out.print("Enter base of squared matrix : ");
        n=sc.nextInt();

        
            int a[][]=new int[n][n];
            int b[][]=new int[n][n];
            int c[][]=new int[n][n];

            System.out.println("Enter elements in first matrix :");
            
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }

            System.out.println("Enter elements in second matrix :");
            
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    b[i][j]=sc.nextInt();
                }
            }
        
        
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    for(int k=0;k<n;k++)
                    {
                        c[i][j]=c[i][j]+a[i][k]*b[k][j];
                    }
                }
            }

            System.out.println("Matrix after Adition : ");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(c[i][j]+" ");

                }
                System.out.println("");
            }
    }
}
    

