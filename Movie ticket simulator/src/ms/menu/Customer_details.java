package ms.menu;

import java.util.Scanner;

import ms.main.Main_cls;

import java.util.ArrayList;
import java.util.Date;

public class Customer_details 
{
	public static ArrayList<Customers> al = new ArrayList<>();

	public void getCustomerDetails(int count) 
	{
		int paid_amount =0;
		int Booking_id=0;
		String name = "";
		String status = "";
		Scanner s = new Scanner(System.in);
		System.out.print("\nYour name: ");
		name = s.nextLine();
		System.out.print("\n");
		int ticketCount = count;
		Date book_date = new Date();
		int bill_amount = ticketCount*120;
		System.out.print("Pay Amount of "+bill_amount+" : ");
		try{
			paid_amount = s.nextInt();
		}catch(Exception e)
		{
			System.out.println("Please give a numeric input");
		}
		System.out.print("\n");
		System.out.println("Payment processing................................................");
		if(paid_amount==bill_amount)
		{
			Main_cls mc = new Main_cls();
			Id_generator ig = new Id_generator();
			Booking_id=ig.generateId(mc.ID);
			mc.ID++;
			status = "booked";
			System.out.println("\nYoo!!...Your payment is Successfull");
			System.out.println("------------------------------------------------------------------");

		}
		else
		{
			status = "failed";
			System.out.println("------------------------------------------------------------------");
			System.out.println("Oopss.....Sorry...Your Payment failed...\nTry again later.....");
		}	
		printDetails(name,ticketCount,book_date,bill_amount,status,Booking_id);
	}
	
	public void printDetails(String name,int count,Date d,int amount,String status,int Book_id)
	{
		System.out.println("NAME: "+name+"\nBOOKED TICKET COUNT: "+count+"\nBOOKING DATE: "+d+"\nAMOUNT: "+amount+"\nBOOKING STATUS: "+status+"\nBOOKING ID: "+Book_id);
		System.out.println("------------------------------------------------------------------");
		Customers c = new Customers(name,count,d,amount,status,Book_id);
		al.add(c);
	}
	public void check(String name,int count,Date d,int amount,String status,int Book_id)
	{
		int len_alist = al.size();
		if(len_alist<1)
		{
			System.out.println("------------------------------------------------------------------");
			System.out.println("\n");
			System.out.println("There is no record yet....");
			System.out.println("IMPORTANT: 'The list gets updated when customers login and do some process in this application.'");
			System.out.println("\n");
		}
		else
		{
			for(Customers cc:al)
			{
				if(cc.name.equals(name))
				{
					if(cc.Book_id==Book_id)
					{
						printCheck(cc.name,cc.count,cc.d,cc.amount,cc.status,cc.Book_id);
					}
				}
				else
				{
					System.out.println("You have not done any process");
				}
			}
		}
		
	}

	public void printCheck(String name,int count,Date d,int amount,String status,int Book_id)
	{
		System.out.println("\n");
		System.out.println("NAME: "+name+"\nBOOKED TICKET COUNT: "+count+"\nBOOKING DATE: "+d+"\nAMOUNT: "+amount+"\nBOOKING STATUS: "+status+"\nBOOKING ID: "+Book_id);
		System.out.println("------------------------------------------------------------------");
	}
	
	
}