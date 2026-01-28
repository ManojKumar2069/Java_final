public class pg22 {
	public static void main(String args[])
	{
		String s1= new String("Hello");
		String s2=new String("Hello");
		String s3="BMS COLLAGE OF ENGINNERING";
		StringBuffer sb=new StringBuffer(s3);
		char[] arr=new char[20];
		s3.getChars(4, 11, arr, 0);
		System.out.println(sb.capacity());
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(arr);
		System.out.println(s1.lastIndexOf('a'));
	}
}
