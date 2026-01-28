import java.util.*;
class ThreadA1 extends Thread
{
	String a;
	StringBuffer arev;
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		a=sc.nextLine();
		try
		{
			//for(int i=0;i<a.length();i++)
			//{
				//arev=a.charAt(i)+arev;
			//}
			StringBuffer sb=new StringBuffer(a);
			arev=sb.reverse();
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
public class pg20 {
	public static void main(String args[])
	{
		ThreadA1 t1=new ThreadA1();
		try
		{
			t1.start();
			t1.join();
			System.out.println("The revered string is "+t1.arev);
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
