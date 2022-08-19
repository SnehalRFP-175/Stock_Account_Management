package StockAccount.BridgeLabz;

import java.util.Scanner;

public class Account_Info{
	
	
	int accountBalance = 1000;
	Scanner sc = new Scanner(System.in);
	
	public void currentBalance()
	{
		System.out.println("\n Your Current Balance :" +accountBalance);
	}
	 
	public void addBalance()
	{
		System.out.println("Enter Your Ammount :");
		int add_Balance = sc.nextInt();
		accountBalance +=add_Balance;
		System.out.println("\n Ammount Added Successfully....");	
	}
	
	public void withdrawBalance()
	{
		System.out.println("Enter Your Ammount :");
		int withdraw_Balance = sc.nextInt();
		if (accountBalance < withdraw_Balance || accountBalance <= 0)
		{
			System.out.println("\n You Don't Have Sufficint Balance.....");
		}
		else
		{
			accountBalance -=withdraw_Balance;
			System.out.println("\n Ammount Withdrawal Successfully....");
		}
		
	}

}
