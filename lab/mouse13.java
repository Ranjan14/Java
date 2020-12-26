//Write a Java program that handles all mouse events and shows the event name at the center of the window when a mouse event is fired.
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class mouse13 extends JFrame implements MouseListener {
    static JFrame f;
    static JLabel l;

    static {
        f = new JFrame("Mouse events");
        l = new JLabel();
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse pressed");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse released");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse exited");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse entered");
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse clicked " + e.getClickCount() + " times.");
    }
    public static void main(String args[]) {

        mouse13 obj = new mouse13();

        JPanel p = new JPanel();

        p.setLayout(new FlowLayout());
        p.setBackground(Color.gray);
        p.add(l);

        f.addMouseListener(obj);

        f.setVisible(true);

        f.add(p);
        f.setSize(500, 400);
    }

    
}