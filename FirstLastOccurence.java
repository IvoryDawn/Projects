import java.util.Arrays;

public class FirstLastOccurence {
    public static int result(int[] arr, int target, String side) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > target) // target is less than the mid term
            {
                end = mid - 1;
            } else if (arr[mid] < target) // target is more than the mid term
            {
                start = mid + 1;
            } else // target is equal to the mid term
            {
                ans = mid;
                if (side.equalsIgnoreCase("Left")) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int ans[] = { -1, -1 };
        int start = result(arr, target, "Left");
        int end = result(arr, target, "Right");
        ans[0] = start;
        ans[1] = end;
        System.out.println(Arrays.toString(ans));
    }
}