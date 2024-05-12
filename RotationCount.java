public class RotationCount {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(findPivot(arr) + 1);
    }
    public static int findPivot(int arr[])
    {
        int start = 0;
        int end = arr.length - 1;
        while(start < end)
        {
            int mid = start + ((end - start) / 2);
            if(mid < end && arr[mid] > arr[mid + 1])
            {
               return mid;
            }
            if(mid > start && arr[mid - 1] > arr[mid])
            {
                return (mid - 1);
            }
            // Left side of the array is sorted so pivot is in right side of the array
            if(arr[start] < arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return -1;
    }
}
