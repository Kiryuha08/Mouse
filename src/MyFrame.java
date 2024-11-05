import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class MyFrame extends JFrame implements MouseListener {
    public MyFrame(){
        addMouseListener(this);

        setSize(640, 480);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        ArrayList<Oval> Ovals = new ArrayList<Oval>();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(0,0,100,100);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Click");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Press");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Realease");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Enter");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exit");
    }
}

