package shapes;

public class rectangle {
	private void calcu_are(int w,int l)
	{
		double sum=w*l;
		System.out.println("The Area of reactangle is "+sum);
	}
	protected void calcu_pre(int w,int l)
	{
		double sum=2+(w*l);
		System.out.println("The perimeter of rectangle is "+sum);
	}
}
