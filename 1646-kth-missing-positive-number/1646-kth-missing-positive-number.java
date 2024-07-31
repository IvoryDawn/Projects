class Solution {
     public boolean Search(int target, int arr[]) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] == target)
                return true;
            else if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }
    public int findKthPositive(int[] arr, int k) {
      int n = arr[arr.length - 1] + k;
        int m = 0;
        for (int i = 1; i <= n; i++) {
            boolean found = Search(i, arr);
            if (found == false) {
                m++;
            } else {
                continue;
            }
            if (m == k) {
                return i;
            }
        }
        return -1;  
    }
}