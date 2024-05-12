public class PalindromeString {
    public static void main(String[] args) {
        String str = "ababa";
        boolean palindrome = true;
        for (int i = 0; i < (str.length() / 2); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                palindrome = false;
            }
        }
        if (palindrome) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
