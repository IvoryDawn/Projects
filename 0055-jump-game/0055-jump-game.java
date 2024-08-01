class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true; // Can reach the only element
        }

        int farthestReach = nums[0]; // Maximum reachable index from the first element

        for (int i = 1; i < nums.length; i++) {
            if (i > farthestReach) { // If current index is beyond farthest reachable, it's unreachable
                return false;
            }

            // Update farthestReach based on the current element's jump distance
            farthestReach = Math.max(farthestReach, i + nums[i]);
        }

        return farthestReach >= nums.length - 1; // Check if farthestReach covers the last element's index
    }
}
