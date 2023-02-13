
abstract class vehicle {
	
	protected String type;
	protected String brand;
	protected int speed;
	protected int gas;
	protected int wheel;
	protected String name;
	protected String license;
	protected int helm;
	protected int price;
	protected String type1;
	protected int ent_sys;
	
	
	public int brand() 
	{
		if(brand.length()>=5) 
		{
			return 1;
		}
		else {
			return 0;
		}
	}
	public int name() 
	{
		if(name.length()>=5) 
		{
			return 1;
		}
		else 
		{
			return 0;
		}
	}
	public int license() 
	{
		int x = license.length();
		int y = license.indexOf(" ", 2);
		
		if(y==-1) 
		{
			return 0;
		}
		char z = license.charAt(0);
		int a = Integer.parseInt(license.substring(2, y));
		int b = x-y-1;
		int boole = 1;
		
		for (int i = y+1; i < license.length(); i++) 
		{
			if(license.charAt(i)<'A' || license.charAt(i)>'Z') 
			{
				boole = 0;
				break;
			}
		}
		
		if(boole==0) 
		{
			return 0;
		}
		
		if(z>='A' && z<='Z'&& x>=5 && x<=10 &&  a>0 && a<10000 && b>0 && b<4) 
		{
			return 1;
		}else 
		{
			return 0;
		}
	}
	
	public int gas() 
	{
		if(gas>=30 && gas<=60) 
		{
			return 1;
		}else 
		{
			return 0;
		}
	}
	
	public int speed() 
	{
		if(speed>=100 && speed<=250) 
		{
			return 1;
		}else 
		{
			return 0;
		}
	}
	
}

class Car extends vehicle
{
	public int ent_sys() 
	{
		if(ent_sys>=1)
		{ 
			return 1;
		}else 
		{
			return 0;
		}
	}
	public int type1() 
	{
		if(type1.equals("SUV") || type1.equals("Supercar")|| type1.equals("Minivan")) 
		{
			return 1;
		}else 
		{
			return 0;
		}
	}
	public int wheel() 
	{
		if(wheel>=4 && wheel<=6) 
		{
			return 1;
		}else 
		{
			return 0;
		}
	}
}

class Datab extends vehicle
{
	
}

class Motor extends vehicle
{
	public int helm() 
	{
		if(helm>=1) 
		{
			return 1;
		}else 
		{
			return 0;
		}
	}
	public int type1() 
	{
		if(type1.equals("Automatic") || type1.equals("Manual")) 
		{
			return 1;
		}else 
		{
			return 0;
		}
	}
	public int wheel() 
	{
		if(wheel>=2 && wheel<=3) 
		{
			return 1;
		}else 
		{
			return 0;
		}
	}
}

