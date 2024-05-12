public class Pattern {
    public static void main(String[] args) {
        int n = 2 * 4;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int ans = 4 - Math.min(Math.min(i, j), Math.min(n - i, n - j));
                System.out.print(ans + " ");
            }
            System.out.println();
        }
    }
}
