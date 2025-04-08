import java.util.Arrays;
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int sum = 0;
        Arrays.sort(nums);
        for(int i = 0; i <nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                result[0] = nums[i];
            } else {
                sum += nums[i];
            }
        }
        sum += nums[nums.length - 1];
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int missingNum = expectedSum - sum;
        result[1] = missingNum;
        return result;
    }
}