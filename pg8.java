interface flyable
{
	void fly_object();
}

class spacecraft implements flyable
{
	public void fly_object()
	{
		System.out.println("This uses rocket fule");
	}
}
class Ariplane implements flyable
{
	public void fly_object()
	{
		System.out.println("This uses Jet Fule");
	}
}
class Helicopter implements flyable
{
	public void fly_object()
	{
		System.out.println("This also uses jet fule");
	}
}

public class pg8 {
	public static void main(String args[])
	{
		flyable f;
		f=new spacecraft();
		f.fly_object();
		f=new Ariplane();
		f.fly_object();
		f=new Helicopter();
		f.fly_object();
	}
}
