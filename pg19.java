public class pg19 {
	public static void main(String args[])
	{
		int arr[]=null;
		try
		{
			//int a=10,b=0,sum;
			//sum=a/b;
			arr = new int[2];
			arr[8]=50;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("The array index is out of bound "+e.getMessage()+" the lenght of arr is "+arr.length);		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("This block runs either way");
		}	
	}
}
