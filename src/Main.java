import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.createBufferStrategy(2);

        while (true) {
            frame.repaint();
            try {
                TimeUnit.MILLISECONDS.sleep(20);
            }
            catch (InterruptedException e) {
            }
        }
    }
}