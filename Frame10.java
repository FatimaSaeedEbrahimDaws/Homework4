import java.awt.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Frame10 extends JComponent {


        public void paintComponent(Graphics g){;
            ImageIcon icon1=new ImageIcon("src//IMG-20211127-WA0000.jpg");
            JLabel label1=new JLabel(icon1);
            label1.setBounds(0,0,icon1.getIconWidth(),icon1.getIconHeight());

            Graphics2D g2=(Graphics2D) g;

//            g2.drawImage(icon1,150,150,icon1);
        }

    }
