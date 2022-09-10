import java.awt.*;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Rectangle box=new Rectangle(3,10,20,30);
        box.add(0,0);
     //   box.translate(0,0);
    // box.setX(0);
        System.out.println("x= "+box.getX());
        System.out.println("y= "+box.getY());
        System.out.println("width= "+box.getWidth());
        System.out.println("height= "+box.getHeight());
    }
}
