package dibujo2d;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Dibujo extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawRect(100, 120, 250, 80);
        g.setColor(Color.BLACK);
        g.drawArc(120, 160, 80, 80, 0, 360);
        g.drawArc(150, 190, 20, 20, 0, 360);
        

        g.setColor(Color.BLACK);
        g.drawRect(100, 120, 250, 80);
        g.setColor(Color.BLACK);
        g.drawArc(240, 160, 80, 80, 0, 360);
        g.drawArc(270, 190, 20, 20, 0, 360);
        

        g.setColor(Color.BLACK);
        g.drawArc(350, 90, 50, 80, 420, 110);

        g.setColor(Color.BLACK);
        g.drawArc(100, 6, 133, 210, 420, 125);
        //g.drawArc( 100, 12, 120, 200, 420, 125 );

        g.setColor(Color.BLACK);
        g.drawLine(200, 20, 200, 120);

    }
}
