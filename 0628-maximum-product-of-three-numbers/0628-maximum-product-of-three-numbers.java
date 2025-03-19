import java.util.Arrays;
class Solution {
    public int maximumProduct(int[] nums) {
        if(nums.length < 3) return -1; 
        if(nums.length == 3) return nums[0] * nums[1] * nums[2];
        Arrays.sort(nums);
        int n = nums.length;
        int prod1 = nums[0] * nums[1] * nums[n - 1];
        int prod2 = nums[n - 1] * nums[n - 2] * nums[n - 3]; 
        return Math.max(prod1, prod2);
    }
}