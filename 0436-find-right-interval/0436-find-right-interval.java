class Solution {
    public int[] findRightInterval(int[][] arr) {
        int ans[] = new int[arr.length];
        int min = -1;
        for (int i = 0; i < arr.length; i++) {
            int end = arr[i][1];
            min = Integer.MAX_VALUE;
            int idx = -1;
            for (int j = 0; j < arr.length; j++) {
                int start = arr[j][0];
                if (start >= end) {
                    if (min > start) {
                        min = start;
                        idx = j;
                    }
                }
            }
            ans[i] = idx;
        }
        return ans;
    }
}