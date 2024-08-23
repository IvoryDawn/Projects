class Solution {
    public static int missingNumber(int[] nums) {
        sort(nums, 0, nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

    static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low, end = high, mid = start + ((end - start) / 2), pivot = nums[mid];
        while (start <= end) {
            while (nums[start] < pivot) {
                start++;
            }
            while (nums[end] > pivot) {
                end--;
            }
            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        sort(nums, low, end);
        sort(nums, start, high);
    }
}