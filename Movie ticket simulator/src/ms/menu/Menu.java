package ms.menu;
import java.util.Scanner;
public class Menu 
{
	public void displayMenu()
	{
		int opt=0;
		System.out.println("------------------------------------------------------------------");
		System.out.println("****************************MAIN MENU******************************");
		System.out.println("\t\t\t1.Movies\n\t\t\t2.Exit");
		System.out.print("\n");
		System.out.println("*****Enter '1' for Movies*****\n*****Enter '2' for Exit  *****");
		System.out.print("\n");
		try
		{
			System.out.print("Your Option: ");
			Scanner s = new Scanner(System.in);
			opt = s.nextInt();
		}catch(Exception e)
		{
			System.out.println("Please select a numeric option given above");
		}
		
		
		System.out.print("\n");
		switch(opt)
		{
		case 1:
		{
			MoviesList ml = new MoviesList();
			ml.showMovies();
			break;
		}
		default:
			System.out.print("\nOopss..your option is invalid\n\n...Going back to the Main Page");
			break;
		}
		
	}
}