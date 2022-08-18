package StockAccount.BridgeLabz;

/* UC1
 * Read in Stock Names, Number of Share, Share Price.
 *Print a Stock Report with the total value of each Stock 
*/

import java.util.Scanner;

public class Stock {
	
	
	private String Share_Name;
	private int No_of_Share;
	private int Share_Price;
	private int Stock_Price;
	
	
	public void setShare_Name(String Share_Name)
	{
		this.Share_Name =  Share_Name;	
	}
	
	public String getShare_Name()
	{
		return Share_Name;		
	}
	
	public void setNo_of_Share(int No_of_Share)
	{
		this.No_of_Share =  No_of_Share;	
	}
	public int getNo_of_Share()
	{
		return No_of_Share;	
	}
	
	public void  setShare_Price(int  Share_Price)
	{
		this.Share_Price =   Share_Price;	
	}
	public int  getShare_Price()
	{
		return Share_Price;
			
	}
	
	public void setStock_Price(int Stock_Price)
	{
		this.Stock_Price =  Stock_Price;	
	}
	
	public void addShare()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name of Share :");
		Share_Name = sc.next();
		
		System.out.println("Enter the Number of Share :");
		No_of_Share = sc.nextInt();
		
		System.out.println("Enter the Share Price :");
		Share_Price = sc.nextInt();
		
		Stock_Price = No_of_Share * Share_Price;
		
		System.out.println("Total Stock Price :" +Stock_Price);
			
	}

}
