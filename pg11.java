import java.awt.*;
import java.awt.Color.*;
import java.awt.event.*;
public class pg11 extends Frame{
	pg11()
	{
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g)
	{
//		Graphics2D g2=(Graphics2D) g;
//		int rectx=150,recty=150,rectw=200,recth=150;
//		g.setColor(Color.YELLOW);
//		g.drawRect(rectx, recty, rectw, recth);
//		g.setColor(Color.GREEN);
//		g.fillRect(rectx+2, recty+2, rectw-2, recth-2);
//		int circles=100;
//		int circlex=rectx+(rectw - circles)/2;
//		int circley=recty+(recth-circles)/2;
//		g2.setColor(Color.WHITE);
//		g2.setStroke(new BasicStroke(15));
//		g2.drawOval(circlex, circley, circles, circles);
//		g.setColor(Color.RED);
//		g.fillOval(circlex, circley, circles, circles);
//		int rect_w=50;
//		int rect_h=20;
//		int in_rect_x=circlex+(circles-rect_w)/2;
//		int in_rect_y=circley+(circles-rect_h)/2;
//		g.setColor(Color.white);
//		g.fillRect(in_rect_x,in_rect_y,rect_w,rect_h);
		int x[]= {100,150,60,50,80};
		int y[]= {50,150,150,40,50};
		g.drawPolygon(x,y,5);
	}
	public static void main(String args[])
	{
		pg11 ob=new pg11();
		ob.setSize(1150,1150);
		ob.setVisible(true);
	}
}
