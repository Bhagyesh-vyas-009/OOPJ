class StringStringUp
{
    public static void main(String[] args)
    {
        boolean flag=true;
        for(int i=0;i<args.length;i++)
        {
               String s=args[i];
               char c1=s.charAt(0);

               if(c1>=65 && c1<=90)
               {
                    flag=false;
                   
               }   
        }
        if(flag)
        {
            System.out.print("Valid");
        }
        else
        {
            System.out.print("Invalid");
             System.exit(0);
        }
     
    }
}