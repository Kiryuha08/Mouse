import java.awt.*;
import java.util.ArrayList;
public class Point {


    int x;
    int y;


    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }


    void paint(Graphics g) {

        g.drawOval(x, y, 1, 1);
    }

}
