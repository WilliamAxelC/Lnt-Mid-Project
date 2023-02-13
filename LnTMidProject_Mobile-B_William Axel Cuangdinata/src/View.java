import java.util.Scanner;

public class View 
{

	public void main() 
	{
		// TODO Auto-generated method stubS
		Basedata viewed = new Basedata();
		Datab data = new Datab();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("|-----|---------------|---------------|");
		System.out.println("| No  |     Type      |      Name     |");
		System.out.println("|-----|---------------|---------------|");
		
		for (int j = 0; j < viewed.count; j++) 
		{
			data = viewed.data.get(j);
			
			int x = 15-data.type.length();
			int y = 15-data.name.length();
			System.out.print("|"+(j+1));
			for (int i = 0; i < 5-j/10-1; i++) 
			{
				System.out.print(" ");
			}
			System.out.print("|"+data.type);
			for (int i = 0; i < x; i++) 
			{
				System.out.print(" ");
			}
			System.out.print("|"+data.name);
			for (int i = 0; i < y; i++) 
			{
				System.out.print(" ");
			}
			System.out.println("|");
			
			System.out.println("|-----|---------------|---------------|");
		}
		System.out.println("|-----|---------------|---------------|");
		
		int choice = -1;
		do 
		{
			System.out.print("Pick a vehicle number to test drive[Enter '0' to exit]: ");
			choice = Integer.parseInt(scan.nextLine());
			
			if (choice>0 && choice<=viewed.count) 
			{
				data = viewed.data.get(choice-1);
				
				System.out.println("Vehicle number #"+choice);
				System.out.println("---------------------");
				System.out.println("Brand: "+data.brand);
				System.out.println("Name: "+data.name);
				System.out.println("License Plate: "+data.license);
				System.out.println("Type: "+data.type1);
				System.out.println("Gas Capacity: "+data.gas);
				System.out.println("Top Speed: "+data.speed);
				System.out.println("Wheel(s): "+data.wheel);
				
				if(data.type.equals("Car")) 
				{
					System.out.println("Entertainment System: "+data.ent_sys);
					System.out.println("Turning on entertainment system...");
					if(data.type1.equals("Supercar")) 
					{
						System.out.println("Boosting!");
					}
				}
				else 
				{
					System.out.println(data.name+" is standing!");
				}
				
				System.out.print("Price: ");
				data.price = Integer.parseInt(scan.nextLine());
				viewed.data.set(choice-1, data);
				System.out.println("Price: "+data.price);
				
			}
			
		} while (choice<0 || choice>viewed.data.size());
		
		if (scan!=null) 
		{
			scan.close();
		}
	}

}
