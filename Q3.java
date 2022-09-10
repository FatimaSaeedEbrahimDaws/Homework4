import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        String word,w1;
        Scanner input =new Scanner(System.in);
        System.out.println("Input word:");
        word=input.next();
        System.out.println(" Input expected result after change each 'i' to '!' and 's' to '$' : ");
        w1=input.next();
      word=word.replaceAll("i","!");
    word= word.replaceAll("s","$");

        System.out.println("word:"+word.replaceAll("i","!"));
    }

}
