package ms.menu;

import java.util.Scanner;

import ms.ticket.Customer_input;

public class MoviesList 
{
	static int seatAllot=0;
	public void showMovies()
	{
		int bt =0;
		Seatallot sa = new Seatallot();
		int avail1=150,avail2=150,avail3=150,avail4=150;
		System.out.println("MOVIES:........");
		System.out.println("\t---Avatar---");
		System.out.print("\n");
		System.out.println("TIMINGS:\n\t***1)9.00AM***\n\t***2)2.00PM***\n\t***3)6.00PM***\n\t***4)9.00PM***");
		Scanner s = new Scanner(System.in);
		System.out.print("\n");
		boolean avi[] = new boolean[150];
		Customer_input ci = new Customer_input();
		System.out.print("Enter your option for a preferrable timing: ");
		try {
			bt = s.nextInt();
		}catch(Exception e)
		{
			System.out.println("\nOopss...you gave alphabetic as the input..");
		}
		seatAllot = bt;
		switch(bt)
		{
			case 1:
			{
				avail1 -= ci.book9am;
				ci.getInfo("9am",avail1,sa.arr);
				break;
			}
			case 2:
			{
				avail2 -= ci.book2pm;
				ci.getInfo("2pm",avail2,avi);
				break;
			}
			case 3:
			{
				avail2 -= ci.book6pm;
				ci.getInfo("6pm",avail3,avi);
				break;
			}
			case 4:
			{
				avail2 -= ci.book9pm;
				ci.getInfo("9pm",avail4,avi);
				break;
			}
			default:
			{
				System.out.println("Enter the correct case");
				break;
			}
		}
	}
}