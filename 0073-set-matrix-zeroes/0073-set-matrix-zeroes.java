class Solution {
    public void SetRow(int[][] matrix, int i) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -11010101;
            }
        }
    }
    public void SetColumn(int[][] matrix, int j) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -11010101;
            }
        }
    }
    public void setZeroes(int[][] matrix) {
       int n = matrix.length, m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    SetRow(matrix, i);
                    SetColumn(matrix, j);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == -11010101) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}