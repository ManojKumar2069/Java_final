class ThreadA extends Thread
{
	public void run()
	{
		System.out.println("ThreadA is running");
	}
}
class ThreadB extends Thread
{
	public void run()
	{
		System.out.println("ThreadB is Running");
	}
}
public class pg9
{
	public static void main(String args[])
	{
		ThreadA t1=new ThreadA();
		ThreadB t2=new ThreadB();
		System.out.println("The initial priority of Thread 1 is "+t1.getPriority());
		System.out.println("The initial priority of Thread 2 is "+t2.getPriority());
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println("The after priority of Thread 1 is "+t1.getPriority());
		System.out.println("The after priority of Thread 2 is "+t2.getPriority());
		t1.start();
		t2.start();
	}
}