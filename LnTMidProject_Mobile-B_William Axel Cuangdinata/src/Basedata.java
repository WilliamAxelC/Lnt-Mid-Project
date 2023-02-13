import java.util.ArrayList;

public class Basedata 
{
	ArrayList<Datab> data = new ArrayList<Datab>();
	int count = 0;
	Datab temp = new Datab();
	
	public void insertdata() 
	{
		data.add(temp);
		count++;
	}
	
	public void setdata(int x) 
	{
		data.set(x, temp);
	}
	
	public static void main(String[] args) 
	{
		Home homepage = new Home();
		homepage.main();
	}
}
