package ms.ticket;

import java.util.Scanner;

import ms.menu.Customer_details;
import ms.menu.Seatallot;

public class Customer_input 
{
	public static int book9am = 0;
	public static int book2pm = 0;
	public static int book6pm = 0;
	public static int book9pm = 0;
	
	public void getInfo(String time,int avail,boolean arr[])
	{
		Seatallot sa = new Seatallot();
		int count =0;
		int seat=0;
		int book_count =0;
		int tic_count = 0;
		int bookopt =0;
		int seats[] = new int[arr.length];
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Available tickets for this show-> "+avail);
		System.out.print("\n");
		System.out.println("!!You've chosen "+time+" show!!");
		System.out.println("---------------------------------------------------------------------");
		System.out.print("To Continue booking tickets - Enter 1(For confirmation): ");
		Scanner s = new Scanner(System.in);
		try
		{
			bookopt = s.nextInt();
		}catch(Exception e)
		{
			System.out.println("You have to give numeric as the input");
		}
		
		if(bookopt == 1)
		{
			System.out.print("\n");
			try
			{
				System.out.print("Enter the count of Tickets: ");
				count = s.nextInt();
			}catch(Exception e)
			{
				System.out.println("You have to give numeric as the input\n");
			}
			
			tic_count = count;
			
			if(count<avail && count>0)
			{
				System.out.print("\n");
				System.out.println("Enter the seat numbers: ");
				for(int k=0;k<count;k++)
				{
					try{
						seat = s.nextInt();
					}catch(Exception e)
					{
						System.out.println("Enter a numeric value");
					}
					seats[k] += seat;
					if(arr[seats[k]]==true)
					{
						System.out.println("already booked");
						break;
					}
					else
					{
						book_count += 1;
					}
				}
			}
		}
		else
		{
			System.out.print("Sorry for the inconvenience");
			System.exit(0);
		}
		
		if(book_count==tic_count && count>0)
		{
			for(int y=0;y<tic_count;y++)
			{
				arr[seats[y]] = true;
			}
			System.out.print("\n");
			System.out.println("The selected seats are available for booking");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("**********Redirecting to details and payment section**********");
			Customer_details cd = new Customer_details();
			cd.getCustomerDetails(tic_count);
		}
		
		else
		{
			System.out.println("Book again");
		}
		
		System.out.println(book_count);
		
		int booked_seats = 0;
		for(int j=0;j<arr.length;j++)
		{
			sa.arr[j]=arr[j];
			if(arr[j]==true)
			{
				booked_seats += 1;
			}
		}
		
		System.out.println(booked_seats);
		if(time.equals("9am"))
		{
			book9am += book_count;
			System.out.println("Total Booked seats of  "+time+" show..>>"+book9am);
		}
		else if(time.equals("2pm"))
		{
			book2pm += book_count;
			System.out.println("Total Booked seats of  "+time+" show..>>"+book2pm);
		}
		else if(time.equals("6pm"))
		{
			book6pm += book_count;
			System.out.println("Total Booked seats of  "+time+" show..>>"+book6pm);
		}
		else if(time.equals("9pm"))
		{
			book9pm += book_count;
			System.out.println("Total Booked seats of  "+time+" show..>>"+book9pm);
		}
		
		
	}
}