import java.util.Scanner;

class oddException extends Exception
{
	oddException(String msg)
	{
		super(msg);
	}
}
class Subclass
{
	int number;
	void check_number(int n) throws oddException
	{
		number=n;
		if(n%2==0)
		{
			System.out.println("Its a even number "+number);
		}
		else
		{
			throw new oddException("Error: its a odd number plz enter only even numbers "+number);
		}
	}
}
public class pg7 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Subclass sub=new Subclass();
		System.out.println("Enter a number");
		int num=sc.nextInt();
		try
		{
			sub.check_number(num);
		}
		catch(oddException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
