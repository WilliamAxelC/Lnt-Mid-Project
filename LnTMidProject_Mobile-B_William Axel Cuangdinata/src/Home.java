import java.util.Scanner;

public class Home 
{
	public void main() 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		do 
		{
			System.out.println("Vehicle Database");
			System.out.println("-------------------");
			System.out.println("1. Input Vehicle Type");
			System.out.println("2. Price Input and Test Drive");
			System.out.println("3. Exit");
			System.out.print("Enter choice:");
			if (scan.hasNextInt()) 
			{
			    choice = scan.nextInt();
			    if (choice < 1 || choice > 3) 
			    {
			      System.out.println("Invalid choice. Please enter a valid integer between 1 and 3.");
			      continue;
			    }
			    scan.nextLine();
			  }
			
			if (choice==1) 
			{
				Input input = new Input();
				System.out.println("Vehicle data");
				System.out.println("----------------");
				input.main();
			}
			else if (choice==2) 
			{
				View view = new View();
				System.out.println("Vehicle data");
				System.out.println("----------------");
				view.main();
			}
		} while (choice != 3);
		if (scan!=null) 
		{
			scan.close();
		}
		System.out.println("We hope to see you again.");
	}

}
