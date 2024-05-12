class Amazon {
    // Function to search for the position of an element in an infinite array
    public static int search(int[] nums, int target) {
        int n = 1;
        // Using exponential search to find the right boundary for binary search
        for (int i = 0; i < n; i = n, n += n) {
            int start = i;
            int end = n;
            while (start <= end) {
                // Calculate the middle index to divide the search space
                int mid = start + ((end - start) / 2);
                if (target == nums[mid]) {
                    // Element found, return its position
                    return mid;
                } else if (target > nums[mid]) {
                    // If the target is greater, search the right half of the current subarray
                    start = mid + 1;
                } else {
                    // If the target is smaller, search the left half of the current subarray
                    end = mid - 1;
                }
            }
        }
        // If the element is not found in the array, return 0
        return 0;
    }

    public static void main(String[] args) {
        // Sample array and target value
        int arr[] = {2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30};
        int ans = search(arr, 15);
        System.out.println("Position of 15 in the array: " + ans);
    }
}