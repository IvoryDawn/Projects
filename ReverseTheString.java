import java.util.*;

public class ReverseTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String sent = sc.nextLine();

        String str = "";

        int len = sent.length();
        String word = "";
        for (int i = 0; i < len; i++) {
            if (sent.charAt(i) != ' ') {
                word += sent.charAt(i);
            }
            str = word + " " + str;
        }

        System.out.println(str);
    }
}
