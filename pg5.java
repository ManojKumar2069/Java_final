interface Routine
{
	public String msg1="2500 Calories needed per day";
	void dite();
	//default void dite(){  (This is used in java 8+ versions like a default value)
		//System.out.println(msg1);
	//}
	void workout(int weight);
}
class person1 implements Routine
{
	public void dite()
	{
		System.out.println(msg1);
	}
	public void workout(int weight)
	{
		if(weight<45){
			System.out.println("Since your weight is "+weight+" you need to perform simple workouts");
		}
		else
		{
			person2 p=new person2();
			p.workout(weight);
		}
	}
}
class person2 implements Routine
{
	public void dite()
	{
		System.out.println(msg1);
	}
	public void workout(int weight)
	{
		if(weight<45){
			person1 p=new person1();
			p.workout(weight);
		}
		else
		{
			System.out.println("Since your weight is " +weight+ " Yaa you need to do full work out");
		}
	}
}
public class pg5 {
	public static void main(String args[]){
		Routine R;
		R=new person1();
		R.dite();
		R.workout(42);
		R.workout(88);
		R=new person2();
		R.dite();
		R.workout(74);
		R.workout(41);
	}
}
