public class Q2 {
    public static void main(String[] args) {
        String word="Mississippi",w1,w2;
        w1=word.replaceAll("i","ii");
        System.out.println(w1+"="+w1.length());
        w2=word.replaceAll("ss","s");
        System.out.println(w2+"="+w2.length());
    }
}
