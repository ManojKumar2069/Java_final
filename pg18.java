import java.util.*;
public class pg18 {
	public static void main(String args[])
	{
		String s,s_lower,s_upper;
		int s_length;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		s=sc.nextLine();
		s_lower=s.toLowerCase();
		s_upper=s.toUpperCase();
		s_length=s.length();
		System.out.println("To Upper case "+s_upper);
		System.out.println("To Lower Case "+s_lower);
		System.out.println("No of char in the string "+s+" is "+s_length);
	}
}
