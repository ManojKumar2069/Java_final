abstract class appliance
{
	abstract void trunon();
	void turnoff()
	{
		System.out.println("Appliance is turned off");
	}
}
class WashingMachine extends appliance
{
	void trunon()
	{
		System.out.println("WashingMachine is running");
	}
}
class Refrigerator extends appliance
{
	void trunon()
	{
		System.out.println("Refrigerator is running");
	}
}
public class pg17 {
	public static void main(String args[])
	{
		appliance a;
		a=new WashingMachine();
		a.turnoff();
		a.trunon();
		a=new Refrigerator();
		a.trunon();
		a.turnoff();
	}
}
