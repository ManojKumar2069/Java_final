import java.util.Scanner;

class check_str
{
	String str1,str2,str3;
	public void check_eq(String str2,String str3)
	{
		if(str2.equalsIgnoreCase(str3))
		{
			System.out.println("Strings are equal");
			System.out.println(str2+" "+str3);
		}
		else
		{
			System.out.println("Strings are not equal");
			System.out.println(str2+" "+str3);
		}
	}
}
public class pg15 {
	public static void main(String args[])
	{
		String s1,s2,s3;
		check_str s=new check_str();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		s1=sc.nextLine();
		s2=s1.substring(2,6);
		System.out.println("Enter another String");
		s3=sc.nextLine();
		s.check_eq(s2, s3);
	}
}
