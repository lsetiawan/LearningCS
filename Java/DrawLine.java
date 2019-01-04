import java.awt.*;

/**
 * DrawLine
 */
public class DrawLine {

    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(500, 400);
        Graphics g = panel.getGraphics();
        g.drawOval(50, 50, 200, 200);

    }
}