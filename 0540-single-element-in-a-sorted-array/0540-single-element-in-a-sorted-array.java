class Solution {
    public int SearchFrequency(int[] arr)
    {
        for(int j = 0; j< arr.length; j++)
        {
            if(arr[j] == 1)
            {
                return j;
            }
        }
        return -1;
    }
    public int singleNonDuplicate(int[] nums) {
       int n = nums.length;
        int[] arr = new int[nums[n - 1] + 1];
        Arrays.fill(arr, 0);
        for (int i = 0; i < n; i++) {
            int curr = nums[i];
            arr[curr] += 1;
        }
        int idx = SearchFrequency(arr);
        return idx; 
    }
}