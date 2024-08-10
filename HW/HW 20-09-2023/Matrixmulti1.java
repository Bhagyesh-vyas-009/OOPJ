import java.util.*;

public class Matrixmulti1
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        int p,q,m,n;

        System.out.print("Enter number of rows in first matrix : ");
        p=sc.nextInt();

        System.out.print("Enter number of columns in first matrix : ");
        q=sc.nextInt();

        System.out.print("Enter number of rows in second matrix : ");
        m=sc.nextInt();

        System.out.print("Enter number of columns in second matrix : ");
        n=sc.nextInt();

        if(q==m)
        {
            int a[][]=new int[p][q];
            int b[][]=new int[m][n];
            int c[][]=new int[p][n];

            System.out.println("Enter elements in first matrix :");
            
            for(int i=0;i<p;i++)
            {
                for(int j=0;j<q;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }

            System.out.println("Enter elements in second matrix :");
            
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    b[i][j]=sc.nextInt();
                }
            }
        
        
            for(int i=0;i<p;i++)
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
            for(int i=0;i<p;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(c[i][j]+" ");

                }
                System.out.println("");
            }

        }
        else
        {
            System.out.println("Matrix multiplication not possible");
        }


    }
}
    

