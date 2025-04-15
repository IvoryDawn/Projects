class Solution {
    public void Sort(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j][0] > arr[j + 1][0]) {
                    int[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;
        
        Sort(intervals);
        
        int n = intervals.length;
        int[][] temp = new int[n][2];
        temp[0] = intervals[0];
        int index = 0;
        
        for (int i = 1; i < n; i++) {
            int[] last = temp[index];
            int[] current = intervals[i];
            
            if (current[0] <= last[1]) {  // Overlapping intervals
                last[1] = Math.max(last[1], current[1]);
            } else {  // Non-overlapping
                temp[++index] = current;
            }
        }
        
        int[][] result = new int[index + 1][2];
        for (int i = 0; i <= index; i++) {
            result[i] = temp[i];
        }
        
        return result;
    }
}