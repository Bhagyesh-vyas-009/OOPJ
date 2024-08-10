/*
 *       *
 * *   * *
 * * * * *
 * *   * *
 *       *

 */

import java.util.*;

public class Pattern3 
{
    public static void main(String[] args) 
    {
    

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        int n = sc.nextInt();

        for (int i = 0; i < n-1; i++) 
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
        }
    }
}
