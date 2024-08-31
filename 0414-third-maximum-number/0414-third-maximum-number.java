class Solution {
    public static int MaxElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    }

    public static int thirdMax(int[] nums) {
        if (nums.length < 3) {
            return MaxElement(nums);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            int count = 0;
            int element = -11345;
            for (int i = 0; i < nums.length; i++) {
                if (!list.contains(nums[i])) {
                    count++;
                    element = nums[i];
                    list.add(element);
                }
            }
            if(list.size() < 3)
            {
                return MaxElement(nums);
            }
            else{
                // Converting arraylist to array
            int maximum[] = new int[list.size()];
            for(int j = 0; j < list.size();j++)
            {
                maximum[j] = list.get(j);
            }
            Arrays.sort(maximum);
            return maximum[maximum.length - 3];
            }
        }
    }
}