import java.util.*;

class Arrprint
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=i+1;
        }
        System.out.print("Array =  ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}