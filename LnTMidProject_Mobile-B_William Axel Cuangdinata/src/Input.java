import java.util.Scanner;

public class Input 
{

	public void main() 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String type = new String();
		do 
		{
			System.out.print("Input type [Car | Motorcycle]: ");
			type = scan.nextLine();
		} while (!(type.equals("Car") || type.equals("Motorcycle")));
		if (type.equals("Car")) 
		{
			Car car = new Car();
			car.type = type;
			do
			{
				System.out.print("Input brand [>= 5]: ");
				car.brand = scan.nextLine();
			} while (car.brand() == 0);
			do 
			{
				System.out.print("Input name [>= 5]: ");
				car.name = scan.nextLine();
			} while (car.name() == 0);
			do 
			{
				System.out.print("Input license: ");
				car.license = scan.nextLine();
			} while (car.license() == 0);
			do 
			{
				System.out.print("Input top speed [100 <= topSpeed <= 250]: ");
				car.speed = Integer.parseInt(scan.nextLine());
			} while (car.speed() == 0);
			do 
			{
				System.out.print("Input gas capacity [30 <= gasCap <= 60]: ");
				car.gas = Integer.parseInt(scan.nextLine());
			} while (car.gas() == 0);
			do 
			{
				System.out.print("Input wheel [4 <= wheel <= 6]: ");
				car.wheel = Integer.parseInt(scan.nextLine());
			} while (car.wheel() == 0);
			do 
			{
				System.out.print("Input type [SUV | Supercar | Minivan]: ");
				car.type1 = scan.nextLine();
			} while (car.type1() == 0);
			do 
			{
				System.out.print("Input entertainment system amount [>= 1]: ");
				car.ent_sys = Integer.parseInt(scan.nextLine());
			} while (car.ent_sys() == 0);

			Basedata keep = new Basedata();
			keep.temp.type = car.type;
			keep.temp.brand = car.brand;
			keep.temp.name = car.name;
			keep.temp.license = car.license;
			keep.temp.speed = car.speed;
			keep.temp.gas = car.gas;
			keep.temp.wheel = car.wheel;
			keep.temp.type1 = car.type1;
			keep.temp.ent_sys = car.ent_sys;
			keep.temp.helm = 0;
			keep.temp.price = 0;
			keep.insertdata();
		} else if (type.equals("Motorcycle")) 
		{
			Motor motor = new Motor();
			motor.type = type;
			do 
			{
				System.out.print("Input brand [>= 5]: ");
				motor.brand = scan.nextLine();
			} while (motor.brand() == 0);
			do 
			{
				System.out.print("Input name [>= 5]: ");
				motor.name = scan.nextLine();
			} while (motor.name() == 0);
			do 
			{
				System.out.print("Input license: ");
				motor.license = scan.nextLine();
			} while (motor.license() == 0);
			do 
			{
				System.out.print("Input top speed [100 <= topSpeed <= 250]: ");
				motor.speed = Integer.parseInt(scan.nextLine());
			} while (motor.speed() == 0);
			do 
			{
				System.out.print("Input gas capacity [30 <= gasCap <= 60]: ");
				motor.gas = Integer.parseInt(scan.nextLine());
			} while (motor.gas() == 0);
			do 
			{
				System.out.print("Input wheel [2 <= wheel <= 3]: ");
				motor.wheel = Integer.parseInt(scan.nextLine());
			} while (motor.wheel() == 0);
			do 
			{
				System.out.print("Input type [Automatic | Manual]: ");
				motor.type1 = scan.nextLine();
			} while (motor.type1() == 0);
			do 
			{
				System.out.print("Input helm amount [>= 1]: ");
				motor.helm = Integer.parseInt(scan.nextLine());
			} while (motor.helm() == 0);

			Basedata keep = new Basedata();
			
			keep.temp.type = motor.type;
			keep.temp.brand = motor.brand;
			keep.temp.name = motor.name;
			keep.temp.license = motor.license;
			keep.temp.speed = motor.speed;
			keep.temp.gas = motor.gas;
			keep.temp.wheel = motor.wheel;
			keep.temp.type1 = motor.type1;
			keep.temp.helm = motor.helm;
			keep.temp.ent_sys = 0;
			keep.temp.price = 0;
			
			keep.insertdata();
		}
		if (scan != null) 
		{
			scan.close();
		}
		System.out.println("Data Inputted Successfully.");
		System.out.println("");
	}

}
