import java.awt.*;
import java.awt.event.*;

public class pgPolygon3D extends Frame
{
    pgPolygon3D()
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
        // -------- TOP POLYGON --------
        int topX[] = {150, 220, 300, 260, 190, 120};
        int topY[] = {120, 90, 120, 160, 160, 120};

        g.drawPolygon(topX, topY, 6);

        // -------- SIDE LINES --------
        int depth = 60;

        for (int i = 0; i < topX.length; i++)
        {
            g.drawLine(topX[i], topY[i],
                       topX[i], topY[i] + depth);
        }

        // -------- BOTTOM POLYGON (FILLED) --------
        int bottomX[] = new int[6];
        int bottomY[] = new int[6];

        for (int i = 0; i < 6; i++)
        {
            bottomX[i] = topX[i];
            bottomY[i] = topY[i] + depth;
        }

        g.setColor(Color.BLACK);
        g.fillPolygon(bottomX, bottomY, 6);
    }

    public static void main(String args[])
    {
        pgPolygon3D f = new pgPolygon3D();
        f.setSize(500, 400);
        f.setTitle("3D Polygon using Frame");
        f.setVisible(true);
    }
}
