import java.awt.Color;
import javax.swing.*;

public class Q10_FrameViewer {

    public static void main(String[] args) {
        JFrame frame=new JFrame("my frame");
        frame.setSize(400,400);
        JLabel label=new JLabel("    Hello, Fatima");
        label.setOpaque(true);
        label.setBackground(Color.GREEN);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
frame.add(new JLabel((new ImageIcon("src//IMG-20211127-WA0000.jpg"))));

        Frame10 m=new Frame10();
        frame.add(m);

    }

}
