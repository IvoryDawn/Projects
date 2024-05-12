import java.util.Arrays;

public class CountingSort {
    public static int findMax(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 3, 1 };
        int n = arr.length;
        int max = findMax(arr); // Finding the maximum number in the arrray
        int[] count = new int[max + 1]; // Array to tarck frequency of each element
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        int[] output = new int[n];
        int j = 0; // output array index

        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                output[j++] = i;
                count[i]--;
            }
        }

        // Copy the sorted elements back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }

        System.out.println(Arrays.toString(arr));
    }
}