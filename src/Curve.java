import java.awt.*;
import java.awt.Point;
import java.util.ArrayList;
public class Curve {

    ArrayList<Point> Points = new ArrayList<Point>();

    public Curve() {
    }

    public void addPoint(int x, int y) {
        Point point = new Point(x, y);
        this.Points.add(point);
    }


}