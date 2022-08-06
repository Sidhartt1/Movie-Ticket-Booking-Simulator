package ms.main;

import ms.menu.*;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.Scanner;

import ms.authentication.authenticator;

public class Main_cls extends Customer_details
{
	public static int ID=0;
	public static void main(String[] args) 
	{
		int choice =0;
		
		while(true)
		{
			System.out.print("\n");
			System.out.println("----------------------Movie ticket booking----------------------");
			System.out.print("\n");
			System.out.println("\t\t  1. Register as a New user\n\t\t  2. Login\n\t\t  3. Check Details\n\t\t  4. Exit the Application");
			System.out.println("----------------------------------------------------------------");
			Scanner s = new Scanner(System.in);
			authenticator.addHash.put("Sidhartt","123123sidh");
			authenticator.addHash.put("Sankar","sankar123");
			authenticator.addHash.put("srinath","1905Srinath");
			try
			{
				System.out.print("Your option: ");
				choice = s.nextInt();
				System.out.println("------------------------------------------------------------------");
			}catch(Exception e)
			{
				System.out.print("\n");
				System.out.println("You gave alphabetic as an input...");
			}
			
			if(choice==1)
			{
				System.out.print("Enter Username: ");
				String user = s.next();
				System.out.print("\n");
				System.out.print("Enter Password: ");
				String pass = s.next();
				authenticator reg = new authenticator(user,pass);
				reg.register(user, pass);			
			}
			else if(choice==2)
			{
				System.out.print("Enter Username: ");
				String user = s.next();
				System.out.print("\n");
				System.out.print("Enter Password: ");
				String pass = s.next();
				System.out.print("\n");
				authenticator ver = new authenticator(user,pass);
				boolean log = ver.verify(user,pass);
				if(log==true)
				{
					System.out.println("------------------------------------------------------------------");
					System.out.print("{{{{{{{{{{{{{{{{{{{{{{{{{{success}}}}}}}}}}}}}}}}}}}}}}}}}}");
					System.out.print("\n");
					Menu mn = new Menu();
					mn.displayMenu();
				}
				else
				{
					System.out.println("------------------------------------------------------------------");
					System.out.println("{{{{{{{{{{{{{{{{{{{{{{{Login Failed}}}}}}}}}}}}}}}}}}}}}}");
				}	
			}
			else if(choice==3)
			{
				Date d1 = new Date();
				System.out.println("Your name: ");
				Scanner s1 = new Scanner(System.in);
				String ch_name = s1.nextLine();
				System.out.println("Your Booking Id: ");
				int ch_id = s1.nextInt();
				Customer_details cd = new Customer_details();
				cd.check(ch_name,0,d1,0,"",ch_id);	
			}
			else if(choice==4)
			{
				System.out.println("Closing the Application");
				System.out.println("Thank you for using our Application.........");
				System.exit(0);
			}
			else
			{
				System.out.print("\n");
				System.out.println("Please select any of the options displayed above(Example:1)");
			}	
				
			
		}	
	}
		
}
