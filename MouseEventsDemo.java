import java.awt.*;
import java.awt.event.*;

public class MouseEventsDemo extends Frame
        implements MouseListener, MouseMotionListener {

    Label l;

    MouseEventsDemo() {
        // Create label
        l = new Label("Perform Mouse Action");
        l.setBounds(50, 50, 300, 20);
        add(l);

        // Register listeners
        addMouseListener(this);
        addMouseMotionListener(this);

        setSize(400, 300);
        setLayout(null);
        setVisible(true);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    // -------- MouseListener methods (4) --------
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered Frame");
    }

    public void mouseExited(MouseEvent e) {
        // not used
    }

    // -------- MouseMotionListener methods (2) --------
    public void mouseMoved(MouseEvent e) {
        l.setText("Mouse Moved at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseDragged(MouseEvent e) {
        l.setText("Mouse Dragged");
    }

    public static void main(String[] args) {
        new MouseEventsDemo();
    }
}
