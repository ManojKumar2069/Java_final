import java.util.Scanner;

class NotEligibleException extends Exception{
	NotEligibleException(String msg){
		super(msg);
	}
}
class Student
{
	Scanner sc=new Scanner(System.in);
	String Name,USN;
	int sem;
	double scored_marks=0;
	double percentage;
	Student(String n,String u,int s)
	{
		Name=n;
		USN=u;
		sem=s;
	}
	void print_de(){
		System.out.println("The name of Student is "+Name);
		System.out.println("The Student Current Semester "+sem);
		System.out.println("The USN of student "+Name+" is "+USN);
	}
	void calculate(int sub) throws NotEligibleException
	{
		double total_marks=sub*50;
		int[] marks=new int[sub];
		for(int i=0;i<=sub-1;i++)
		{
			System.out.println("Enter Marks of "+(i+1)+" Subject"); 
			int subm=sc.nextInt();
			if(subm<=50){
				marks[i]=subm;
			}
			else
			{
				System.out.println("Marks cannot be greater than 50");
				break;
			}
		}
		for(int i=0;i<=sub-1;i++)
		{
			scored_marks+=marks[i];
		}
		percentage=(scored_marks/total_marks)*100;
		if(percentage>80)
		{
			System.out.println("Your pecentage is "+percentage);
			System.out.println("Distinction");
		}
		else if(percentage<80 && percentage>=60)
		{
			System.out.println("Your pecentage is "+percentage);
			System.out.println("first Class");
		}
		else if(percentage<60 && percentage>40)
		{
			System.out.println("Your pecentage is "+percentage);
			System.out.println("second Class");
		}
		else
		{
			System.out.println("Your pecentage is "+percentage);
			throw new NotEligibleException("Your not eligble");
		}
	}
}
public class pg6 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student name");
		String name=sc.nextLine();
		System.out.println("Enter Student usn");
		String usn=sc.nextLine();
		System.out.println("Enter Student sem");
		int sem=sc.nextInt();
		Student s=new Student(name,usn,sem);
		System.out.println("Enter how much subjects");
		int sub=sc.nextInt();
		try
		{
			s.calculate(sub);
		}
		catch(NotEligibleException e){
			System.out.println(e.getMessage());
		}
		s.print_de();
	}
}
