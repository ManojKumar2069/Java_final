class Storage<T>
{
	T ob;
	Storage(T ob)
	{
		this.ob=ob;
	}
	void display()
	{
		System.out.println("The datype is "+ob.getClass().getName()+"\n"+" value is "+ob);
	}
}
public class pg16 {
	public static void main(String args[])
	{
		Storage<Integer> s1=new Storage<Integer>(15);
		Storage<String> s2=new Storage<String>("MKs");
		Storage<Double> s3=new Storage<Double>(15.3);
		s1.display();
		s2.display();
		s3.display();
	}
}
