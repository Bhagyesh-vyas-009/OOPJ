/*
WAP to create Account class, which is representing a bank account
where we can deposit and withdraw money. if we want to withdraw
money which exceed our bank balance? We will not be allowed, create
InSufficientFundException to handle above situation and display proper
error message.
 */

import java.util.*;
class InSufficientFundException extends Exception{
    InSufficientFundException(String s)
    {
        super(s);
    }
}
class Account
{
    double balance;

    Account()
    {
        balance=5000;
    }
    void display()
    {
        System.out.println("Balance = "+balance);
    }
    void deposit(double amount)
    {
        balance=balance+amount;
        System.out.println("Total balance = "+balance);
    }
    void withdraw(double amount)throws InSufficientFundException
    {
        try
        {
            if(amount>balance)
            {
                throw new InSufficientFundException("InSufficient Fund");
            }
            else
            {
                balance=balance-amount;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public class P8_3 
{
    public static void main(String[] args) throws InSufficientFundException
    {
        Scanner sc=new Scanner(System.in);
        Account ac=new Account();
        

        boolean flag=true;
        while(flag)
        {
            System.out.println("1.Deposit Amount \n"+
                                "2.Withdraw Amount \n"+
                                "3.Display balance \n"+
                                "4.Exit \n");
            System.out.println("Enter Choice : ");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter Amount to deposit : ");
                    double amt=sc.nextDouble();
                    ac.deposit(amt);
                    break;
                case 2:
                    System.out.println("Enter Amount to Withdraw : ");
                    double wamt=sc.nextDouble();
                    ac.withdraw(wamt);
                    break;
                case 3:
                    ac.display();
                    break;
                case 4:
                    flag=false;
                    System.out.println("Exited.........");
                    break;
                default:
                    System.out.println("Invalid choice...");
                    break;
            }
        }
    }    
}
