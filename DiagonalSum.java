public class DiagonalSum {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int n = arr.length;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            // primary diagonal
            sum += arr[i][i];

            // Secondary Diagonal
            if (i != (n - i - 1)) {
                sum += arr[i][n - i - 1];
            }
        }
        System.out.println("Diagonal Sum is : " + sum);
    }
}