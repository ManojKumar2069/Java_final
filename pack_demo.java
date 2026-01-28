package shapes;
import shapes.rectangle;
import shapes.Circle;
public class pack_demo {
	public static void main(String args[])
	{
		rectangle r=new rectangle();
		Circle c=new Circle();
		r.calcu_are(150, 50);
		r.calcu_pre(200, 40);
		c.circum(400);
	}
}
