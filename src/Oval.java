import java.awt.*;
import java.util.ArrayList;

public class Oval {
    int x;
    int y;
    int r = 1;

    public Oval(int x,int y){
        this.x = x;
        this.y = y;
    }

    void paintOval(Graphics g) {
        g.fillOval(x-r/2, y-r/2, r, r);
    }

}
