class Solution {
    public int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end)
        {
            int mid = start + ((end - start) / 2);
            int curr = arr[mid];
            if(target == curr)
            {
              return mid;
            }
            if(target > curr)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return -1;   // Element does not exists
    }
}