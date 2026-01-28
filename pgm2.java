import java.util.*;
abstract class calculate{
	public double x,y,res;
	abstract public void calcu(double a,double b);
	abstract void print_res();
}
class add extends calculate{
	public void calcu(double a,double b){
		super.x=a;
		super.y=b;
		super.res=a+b;
	}
	void print_res(){
		System.out.println(super.x+" + "+super.y+" = "+super.res);
	}
}
class subtract extends calculate
{
	public void calcu(double a,double b){
		super.x=a;
		super.y=b;
		super.res=a-b;
	}
	void print_res(){
		System.out.println(super.x+" + "+super.y+" = "+super.res);
	}
}

class multiply extends calculate
{
	public void calcu(double a,double b){
		super.x=a;
		super.y=b;
		super.res=a*b;
	}
	void print_res(){
		System.out.println(super.x+" + "+super.y+" = "+super.res);
	}
}
public class pgm2 {
	public static void main(String args[]){
		while(true){
		System.out.println("1.ADD\n2.Subtract\n3.Multiply");
		System.out.println("Enter a choice");
		double a,b;
		Scanner sc=new Scanner(System.in);
		int cho=sc.nextInt();
		switch(cho){
		case 1:
			System.out.println("Enter first number");
			a=sc.nextDouble();
			System.out.println("Enter second number");
			b=sc.nextDouble();
			add a_c=new add();
			a_c.calcu(a, b);
			a_c.print_res();
			break;
		case 2:
			System.out.println("Enter first number");
			a=sc.nextDouble();
			System.out.println("Enter second number");
			b=sc.nextDouble();
			subtract s_c=new subtract();
			s_c.calcu(a, b);
			s_c.print_res();
			break;
		case 3:
			System.out.println("Enter first number");
			a=sc.nextDouble();
			System.out.println("Enter second number");
			b=sc.nextDouble();
			multiply m_c=new multiply();
			m_c.calcu(a, b);
			m_c.print_res();
			break;
		default:
			System.out.println("Enter a proper choice");
			break;
		}
		}
	}
}
