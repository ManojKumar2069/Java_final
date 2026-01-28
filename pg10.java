package sample;
import exception.*;
import java.util.*;
class input
{
	public void get_input(int a) throws invalidException
	{
		if(a>0)
		{
			System.out.println("Yaa bro ita a positive ineger");
		}
		else
		{
			throw new invalidException("Yaa its a negative number");
		}
	}
}
public class pg10 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		input i=new input();
		System.out.println("Enter a number");
		int a=sc.nextInt();
		try
		{
			i.get_input(a);
		}
		catch(invalidException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
