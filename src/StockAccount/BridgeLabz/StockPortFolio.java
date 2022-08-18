package StockAccount.BridgeLabz;

import java.util.Scanner;

public class StockPortFolio extends Stock {
	
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number of Stock : ");
		int No_of_Stock = sc.nextInt();
		for(int i = 0 ; i < No_of_Stock ; i++ )
		{
			Stock stock = new Stock();
			
			stock.addShare();
		}
	}

}
