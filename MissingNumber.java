class MissingNumber {
    public static void main(String[] args) {
        int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 }; // Example array
        int n = arr.length;
        System.out.println(sort(arr));
    }

    public static int sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is within the array bounds and not at the
            // correct position
            if (arr[i] < arr.length && arr[i] != i) {
                // Swap the element to its correct position
                swap(arr, i, arr[i]);
            }
        }

        // Find the first index that doesn't match its value, which is the missing
        // number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }

        // If all elements are at their correct positions, the missing number is N
        return arr.length;
    }

    public static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
