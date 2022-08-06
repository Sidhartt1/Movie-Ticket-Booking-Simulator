package ms.menu;

import ms.ticket.Customer_input;

public class Seatallot 
{
	public static boolean arr[] = new boolean[150];
	public static void seats()
	{
		int avail1=150,avail2=150,avail3=150,avail4=150;
		Customer_input ci = new Customer_input();
		MoviesList ml = new MoviesList();
		switch(ml.seatAllot)
		{
		case 1:
		{
			avail1 -= ci.book9am;
			boolean arr[] = new boolean[avail1];	
		}
		}
		
	}
}