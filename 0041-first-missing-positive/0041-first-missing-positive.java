class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        if(len == 1){
            if(nums[0] == 1){
                return 2;
            }
            else{
                return 1;
            }
        }
        Arrays.sort(nums);
        int a = 1;
        for (int i = 0; i < len; i++) {
            if (Arrays.binarySearch(nums, a) < 0) {
                return a;
            }
            a++;
        }
        return a;
    }
}