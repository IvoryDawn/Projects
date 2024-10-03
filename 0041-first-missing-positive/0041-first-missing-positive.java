class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n+1];
        seen[0] = true;

        for(int i=0; i<n; i++){
            if(nums[i]>0 && nums[i] <= n){
                seen[nums[i]] = true;
            }
        }

        for(int i=1; i<n+1; i++){
            if(seen[i]==false){
                return i;
            }
        }
        return n+1;
    }
}