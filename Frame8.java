import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Frame8  extends JComponent {


        public void paintComponent(Graphics g){;

            Rectangle r=new Rectangle(100,100,150,100);
            Graphics2D g2=(Graphics2D) g;
            g2.setColor(Color.BLUE);
            g2.fill(r);
            String name= new String("Fatima");

            g2.setColor(Color.red);
            g2.drawString(name,150,150);
        }




}
