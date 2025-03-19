class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length == 1) return nums;
        int result[] = new int[nums.length];
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                result[j] = nums[i];
                j++;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 != 0){
                result[j] = nums[i];
                j++;
            }
        }
        return result;
    }
}