import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.Color;

public class Myframe extends JComponent {

        public void paintComponent(Graphics g){;

            Rectangle r=new Rectangle(100,100,200,100);
            Graphics2D g2=(Graphics2D) g;
            g2.setColor(Color.pink);
            g2.fill(r);
            Rectangle ra=new Rectangle(300,100,200,100);
            g2.setColor(purple);
            g2.fill(ra);
        }
    public static final Color purple=new Color(102,0,153);

}
