class Solution {
    public int SearchCount(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] >= 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (arr.length - start);
    }
    public int countNegatives(int[][] grid) {
        int count = 0, arr[] = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            int idx = 0;
            for (int j = 0; j < grid[0].length; j++, idx++) {
                arr[idx] = grid[i][j];
            }
            count += SearchCount(arr);
        }
        return count;       
    }
}