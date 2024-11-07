import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;

public class MyFrame extends JFrame implements MouseListener, MouseMotionListener {
    ArrayList<Oval> Ovals = new ArrayList<Oval>();

    ArrayList<Curve> Curves = new ArrayList<Curve>();



    public MyFrame(){
        addMouseListener(this);
        addMouseMotionListener(this);


        setSize(640, 480);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }



    @Override
    public void paint(Graphics g) {
        BufferStrategy bufferStrategy = getBufferStrategy();        // Обращаемся к стратегии буферизации
        if (bufferStrategy == null) {                               // Если она еще не создана
            createBufferStrategy(2);                                // то создаем ее
            bufferStrategy = getBufferStrategy();                   // и опять обращаемся к уже наверняка созданной стратегии
        }
        g = bufferStrategy.getDrawGraphics();                       // Достаем текущую графику (текущий буфер)
        g.clearRect(0, 0, getWidth(), getHeight());                 // Очищаем наш холст (ведь там остался предыдущий кадр)
        //for(int i=0; i<Points.size();i++){
        //    Points.get(i).paint(g);
        //}
        for(int i=0; i<Curves.size();i++){
            for(int j=1; j<Curves.get(i).Points.size();j++) {
                g.drawLine(Curves.get(i).Points.get(j-1).x, Curves.get(i).Points.get(j-1).y, Curves.get(i).Points.get(j).x, Curves.get(i).Points.get(j).y);
            }
        }

        //g.fillOval(0,0,100,100);

        g.dispose();                // Освободить все временные ресурсы графики (после этого в нее уже нельзя рисовать)
        bufferStrategy.show();      // Сказать буферизирующей стратегии отрисовать новый буфер (т.е. поменять показываемый и обновляемый буферы местами)
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Click");
        //Oval oval = new Oval(e.getX(), e.getY());
        //this.Ovals.add(oval);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Press");
        Curves.add(new Curve());
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

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Mouse Drag");
        //Point point = new Point(e.getX(), e.getY());
        this.Curves.get(this.Curves.size()-1).addPoint(e.getX(), e.getY());

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //System.out.println("Mouse Move");
    }
}

