class printnumber
{
	int num=1;
	synchronized public void print_odd()
	{
		while(num<=10)
		{
			if(num%2==1)
			{
				System.out.println(num);
				num++;
				notify();
			}
			else
			{
				try
				{
					wait();
				}
				catch(InterruptedException e)
				{
					System.out.println(e.getMessage());
				}
			}
		}
	}
	synchronized public void print_even()
	{
		while(num<=10)
		{
			if(num%2==0)
			{
				System.out.println(num);
				num++;
				notify();
			}
			else
			{
				try{
				wait();
				}
				catch(InterruptedException e)
				{
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
class oddThread extends Thread
{
	printnumber p;
	oddThread(printnumber p)
	{
		this.p=p;
	}
	public void run()
	{
		p.print_odd();
	}
}
class evenThread extends Thread
{
	printnumber p;
	evenThread(printnumber p)
	{
		this.p=p;
	}
	public void run()
	{
		p.print_even();
	}
}
public class pg21
{
	public static void main(String args[])
	{
		printnumber p=new printnumber();
		new oddThread(p).start();
		new evenThread(p).start();
	}
}