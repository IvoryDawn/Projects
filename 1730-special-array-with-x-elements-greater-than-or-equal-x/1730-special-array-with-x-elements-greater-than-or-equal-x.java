class Solution {
    public int specialArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                int num = arr[j];
                if (num >= i) {
                    count++;
                }
            }
            if (count == i) {
                return i;
            }
        }
        return -1;
    }
}