import java.awt.*;
import javax.swing.*;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class frame9 extends JComponent {

    public void paintComponent(Graphics g){;

        Rectangle r=new Rectangle(25,25,100,200);
        Graphics2D g2=(Graphics2D) g;
        g2.setColor(Color.black);
        g2.fill(r);
        Ellipse2D.Double c1=new Ellipse2D.Double(50,50,50,50);
        g2.setColor(Color.red);
        g2.fill(c1);
        Ellipse2D.Double c2=new Ellipse2D.Double(50,100,50,50);
        g2.setColor(Color.yellow);
        g2.fill(c2);
        Ellipse2D.Double c3=new Ellipse2D.Double(50,150,50,50);
        g2.setColor(Color.green);
        g2.fill(c3);
        Line2D.Double line=new Line2D.Double(75,200,75,500);
        g2.setColor(Color.black);
        g2.draw(line);
        g2.fill(line);


    }
}
