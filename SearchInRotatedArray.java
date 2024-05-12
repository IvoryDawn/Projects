public class SearchInRotatedArray {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 7;
        System.out.println(search(arr, target));
    }
    static int search(int arr[], int target)
    {
        int peak = Pivot(arr);
        if(peak == -1)
        {
            // If pivot is not present that means the array is not a rotated array
            // Do ordinary binary serach ton find the target in the array
            return BinarySearch(arr, target, 0, arr.length - 1);
        }
        // If pivot is there that means there are 2 ascending arrays 
        if(target == arr[peak])
        {
            // If target is equal to the pivot point of the rotated array
            return peak;
        }
        if(target < arr[0])
        {
            return BinarySearch(arr, target, peak + 1, arr.length - 1);
        }
        return BinarySearch(arr, target, 0, peak - 1);
    }
    static int BinarySearch(int[] arr, int target, int start, int end)
    {
        while(start <= end)
        {
            int mid = start - ((end - start) / 2);
            if(target < arr[mid])
            {
                end = mid - 1;
            }
            else if(target == arr[mid])
            {
                return mid;
            }
            else
            {
                start = mid + 1;
            }
        }
        return -1;  // element not found
    }
    static int Pivot(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while(start < end)
        {
            int mid = start +((end - start) / 2);
            // Cases to find pivots
            if(mid < end && arr[mid + 1] < arr[mid])
            {
                return mid;
            }
            if(mid > start && arr[mid - 1] > arr[mid]) 
            {
                return mid - 1;
            }
            if(arr[start] >= arr[mid])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return -1;       // Element not found
    }
}
