import java.awt.*;
import java.util.Scanner;

public class Q1_PerimeterTester {

    public static void main(String[] args) {
        Rectangle in=new Rectangle(40,50);

        System.out.print("Perimeter=");
        System.out.println(2*(in.getHeight()+in.getWidth()));
        System.out.println("Expected perimeter="+2*(40+50));

    }

}
