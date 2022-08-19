package StockAccount.BridgeLabz;

/*
 * UC2-Account to provide a method called debit that withdraws money from an Account.
 */
import java.util.Scanner;

public class Account extends Account_Info
{
	public void account()
	{
		Scanner Sc = new Scanner(System.in);
		Account_Info acnt_info = new Account_Info();
		
		while(true)
		{

		System.out.println("\n 1.View Your Current Balance \n 2. Add Balance \n 3. Withdraw Balance \n 4. Exit \n");
		System.out.print("Please Enter Your Choice: ");
		
		int ch = Sc.nextInt();
		
		switch(ch)
		{
			case 1:
				acnt_info.currentBalance();
				break;
				
			case 2:
				acnt_info.addBalance();
				break;
				
			case 3:
				acnt_info.withdrawBalance();
				
				break;
				
			case 4:
				System.out.println("Exited Successfully...");
				return;
				
			default:
				System.out.println("Please Enter Valid Option....");
				break;
				
		}
	}

}
	
	public static void main(String a[])
	{
		Account acnt=new Account();
		
		acnt.account();
	}
		
}
