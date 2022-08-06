package ms.menu;

import java.util.ArrayList;
import java.util.Date;

public class Customers 
{
	public String name;
	public int count;
	public Date d = new Date();
	public int amount;
	public String status;
	public int Book_id;
	public Customers(String name,int count,Date d,int amount,String status,int Book_id)
	{
		this.name = name;
		this.count = count;
		this.d = d;
		this.amount = amount;
		this.status = status;
		this.Book_id = Book_id;
	}
	public void check(String name,int id)
	{
	}
		
}