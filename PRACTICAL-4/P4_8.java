import java.util.*;

class P4_8
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter Array size : ");
        int n=sc.nextInt();

        int a[]=new int[n];
        int temp[]=new int[n];

        System.out.println("Enter array elements : ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();  
        }

        System.out.println("Enter pivot : ");
        int p=sc.nextInt();

        for(int i=p,j=0;i<n;i++,j++)
        {
            temp[j]=a[i];
        }

        int tp=p;

        for(int i=0;i<p;i++)
        {
            temp[(a.length)-tp]=a[i];
            tp--;
        }
        System.out.println();

        System.out.println("Rotated array =");
        
        for(int j=0;j<n;j++)
        {
          
            System.out.println(temp[j]);
        }

        System.out.println("Enter element to search : ");       
        int s=sc.nextInt();
        int index=0;
boolean flag=false;

        for(int i=0;i<temp.length;i++)
        {

            if(temp[i]==s)
            {
	flag=true;
                     System.out.print(i);
	break;
            }
else
{
		
}

            
        }

//        System.out.println(s+" is found at position = "+index);
        
                
        
    }
}