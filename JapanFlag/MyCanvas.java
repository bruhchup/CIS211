import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;

public class MyCanvas 
extends Canvas {
    Color dotColor;
    
    public void setColor (Color dotColor) {
        this.dotColor = dotColor;
    }
    
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(100,50,100,100);
    }
}
