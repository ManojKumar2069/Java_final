class overload{
	int x,y;
	double a,b;
	overload(int x,int y){
		this.x=x;
		this.y=y;
		int sum=x+y;
		double sum1= sum;
		System.out.println(x+" "+y+"= "+sum);
		System.out.println(sum1);
	}
	overload(int x,double a){
		this.x=x;
		this.a=a;
		double sum=x+a;
		System.out.println(x+" "+a+"= "+sum);
	}
	overload(double a,double b){
		this.a=a;
		this.b=b;
		double sum=a+b;
		int sum1=(int)sum;
		System.out.println(a+" "+b+"= "+sum);
		System.out.println(sum1);
	}
}
public class pg1 {
	public static void main(String args[]){
		int x=10,y=20;
		double a=10.5;
		double b=20.9;
		overload o=new overload(x,y);
		overload o1=new overload(x,b);
		overload o2=new overload(a,b);
	}
}
