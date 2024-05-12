public class SpiralMatrix {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int n = arr.length;

        int startRow = 0;
        int endRow = (n - 1);
        int startCol = 0;
        int endCol = (n - 1);
        while (startRow <= endRow && startCol <= endCol) {
            // Top
            for (int col = startCol; col <= endCol; col++) {
                System.out.print(arr[startRow][col] + "  ");
            }

            // Right
            for (int row = startRow + 1; row <= endRow; row++) {
                System.out.print(arr[row][endCol] + "  ");
            }

            // Bottom
            for (int col = endCol - 1; col >= startCol; col--) {
                System.out.print(arr[endRow][col] + " ");
            }

            // Left
            for (int row = endRow - 1; row >= startRow + 1; row--) {
                System.out.print(arr[row][startCol] + " ");
            }

            // Updation
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        System.out.println();
    }
}