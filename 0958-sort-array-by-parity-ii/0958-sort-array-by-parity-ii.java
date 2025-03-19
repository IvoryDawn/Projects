class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        if(nums.length == 1) return nums;
        int[] result = new int[nums.length];
        int j = 0;
        int i = 0;
        while(i < nums.length){
            if(nums[i] % 2 == 0){
                result[j] = nums[i];
                j += 2;
            }
            i++;
        }
        j = 1;
        i = 0;
        while(i < nums.length){
            if(nums[i] % 2 != 0){
                result[j] = nums[i];
                j += 2;
            }
            i++;
        }
        return result;
    }
}