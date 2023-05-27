package Banking;

import java.util.Scanner;

public class Account 
{
	private static String accno;
	static String name;
	static long balance,amt;
	
	Scanner sc =new Scanner(System.in);
	
	public void showAccount()
	{
		System.out.println("Enter Account no : ");
		accno=sc.next();
		System.out.println("Enter Name : ");
		name=sc.next();
		
		System.out.println("Account holder name : " + name);
		System.out.println("Account no : " + accno);
		
	}
	//method to check balance
	public void balance()
	{
		balance=10000;
	}
	
	//method ton deposit money
	public void deposit()
	{
		System.out.println("Enter the amount you want to deposit : ");
		amt =sc.nextLong();
		balance=balance + amt;
		System.out.println("Rs. "+amt+" is deposited successfully.");
		System.out.println("Total amount after deposit : " + balance);
	}

	//method to withdraw money
	public void withdrawal()
	{
		System.out.println("Enter the amount you want to withdraw : ");
		amt=sc.nextLong();
		if (balance >= amt)
		{
			balance =balance - amt;
			
			System.out.println("Rs. "+amt+" is withdrawed successfully.");
			System.out.println("Total amount after withrawal : " + balance);
		}
		else
		{
			System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!");
		}
	}
	void output()
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		do 
		{
		System.out.println("****Welcome to HDFC bank****");
		System.out.println("1.Display all account details");
		System.out.println("2.Check Balance");
		System.out.println("3.Deposit the amount");
		System.out.println("4.Withdraw the amount");
		System.out.println("5.Exit");

		System.out.println("Enter your choice : ");
		ch=sc.nextInt();
		
		 switch(ch) 
		 {
		 case 1:
			 showAccount();
			 break;
			 
		 case 2:
			 balance();
			 System.out.println("Your account balance is : " + balance);
			 break;
		
		 case 3:
			 balance();
			 deposit();
			 break;	
			 
		 case 4:
			 balance();
			 withdrawal();
			 break;	
			 
		 case 5:
			 System.out.println("Exit");
			 break;	 
		 }
	    }
		while(ch!=5);
	}
	public static void main(String[] args)
	{
		Account ac=new Account();
		ac.output();
	}

}
