class Employee
{
	public void work()
	{
		System.out.println("Employee is working");
	}
}
class Manager extends Employee
{
	public void work()
	{
		System.out.println("Manager is Managing");
	}
}
class Developer extends Employee
{
	public void work()
	{
		System.out.println("Develpoer is coding");
	}
}
public class pg14 {
	public static void main(String args[])
	{
		Employee[] emp= new Employee[3];
		emp[0]=new Employee();
		emp[1]=new Manager();
		emp[2]=new Developer();
		for(Employee e: emp)
		{
			e.work();
		}
		
	}
}
