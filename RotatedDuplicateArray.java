// Java program to search an element in a rotated and duplicated array

public class RotatedDuplicateArray {

    // Main method to test the search function
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 6, 4, 3, 2 , 2};
        System.out.println(search(arr, 6));
    }

    // Function to search for a target element in a rotated and duplicated array
    public static int search(int arr[], int target) {
        // Find the pivot index (the index where rotation occurs)
        int pivot = findPivot(arr);

        // Perform binary search in the appropriate half of the array
        int left = BinarySearch(arr, target, 0, pivot);
        if(left != -1) {
            return left;  // Return the index if found in the left half
        }

        int right = BinarySearch(arr, target, pivot, arr.length - 1);
        return right;  // Return the index if found in the right half
    } 

    // Binary search function to find the target in the specified range
    public static int BinarySearch(int arr[], int target, int start, int end) {
        while(start <= end) {
            int mid = start + ((end - start) / 2);
            if(target == arr[mid]) {
                return mid;  // Return the index if the target is found
            } else if(target > arr[mid]) {
                start = mid + 1;  // Adjust the search range
            } else {
                end = mid - 1;  // Adjust the search range
            }
        }
        return -1;  // Return -1 if the target is not found
    }

    // Function to find the pivot index in the rotated array
    public static int findPivot(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + ((end - start) / 2);

            // Check if mid is the pivot
            if(mid > start && arr[mid - 1] > arr[mid]) {
                return (mid - 1);
            }

            // Check if mid+1 is the pivot
            if(mid < end && arr[mid + 1] > arr[mid]) {
                return (mid  + 1);
            }

            // Handle the case of duplicate elements
            if(arr[start] == arr[mid] && arr[mid] == arr[end]) {
                // Skip the duplicates and check if start or end is the pivot
                if(arr[start + 1] < arr[start]) {
                   return start;
                }
                start++;

                if(arr[end - 1] > arr[end]) {
                    return (end - 1);
                }
                end--;               
            } else if(arr[start]  < arr[mid] || (arr[start] == arr[mid] && arr[mid] == arr[end])) {
                // If left side is sorted or all elements are equal, pivot is on the right side
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;  // Return -1 if no pivot is found
    }
}
