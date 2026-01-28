
abstract class vehicle
{
	double c_fe=106.5,t_fe=80.2,b_fe=110.2;
	abstract void details(String model,int Year,String Fule_type);
	abstract void cal_eff(double distance_t,double f_c);
	abstract void dis(double f_c);
	abstract void max_speed(double dis,double time);
}

class car extends vehicle
{
	String model,fule_type;
	int year;
	double cal_ef,dis,max;
	void details(String m,int y,String f)
	{
		model=m;
		year=y;
		fule_type=f;
	}
	void cal_eff(double d,double f_c)
	{
		cal_ef=d/f_c;
		System.out.println("The fule efficency of the car with model "+model+" is "+cal_ef);
	}
	void dis(double f_c)
	{
		dis=cal_ef*f_c;
		System.out.println("The distance you can travel with the fule "+f_c+" is "+dis);
	}
	void max_speed(double d,double t)
	{
		max=d/t;
		System.out.println("The maximum speed is "+max);
	}
}

class truck extends vehicle
{
	String model,fule_type;
	int year;
	double cal_ef,dis,max;
	void details(String m,int y,String f)
	{
		model=m;
		year=y;
		fule_type=f;
	}
	void cal_eff(double d,double f_c)
	{
		cal_ef=d/f_c;
		System.out.println("The fule efficency of the Truck with model "+model+" is "+cal_ef);
	}
	void dis(double f_c)
	{
		dis=cal_ef*f_c;
		System.out.println("The distance you can travel with the fule "+f_c+" is "+dis);
	}
	void max_speed(double d,double t)
	{
		max=d/t;
		System.out.println("The maximum speed is "+max);
	}
}

class bike extends vehicle
{
	String model,fule_type;
	int year;
	double cal_ef,dis,max;
	void details(String m,int y,String f)
	{
		model=m;
		year=y;
		fule_type=f;
	}
	void cal_eff(double d,double f_c)
	{
		cal_ef=d/f_c;
		System.out.println("The fule efficency of the bike with model "+model+" is "+cal_ef+" km/L");
	}
	void dis(double f_c)
	{
		dis=cal_ef*f_c;
		System.out.println("The distance you can travel with the fule "+f_c+" is "+dis+" KM");
	}
	void max_speed(double d,double t)
	{
		max=d/t;
		System.out.println("The maximum speed is "+max+" km/h");
	}
}
public class pg4 {
	public static void main(String args[]){
		vehicle v;
		v=new bike();
		v.details("RX100",1950, "Petrole");
		v.cal_eff(105, 50);
		v.dis(50);
		v.max_speed(800,5);
	}
}
