// NOTE : Please check all the approaches for this problem. Fourth Approach which is most efficient is included in the last :)

// First Approach with Time complexity of O(n^2) ans space complexity of O(n)
// You solved this yourself .
import java.util.*;

public class LeadersinArray {

    public static boolean IsLeader(int arr[], int start) {
        int el = arr[start];
        int max = 0;
        for (int i = start + 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return (max <= el);
    }

    public static void main(String[] args) {
        int arr[] = { 16, 17, 4, 3, 5, 2 };

        // Print the array
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (IsLeader(arr, i)) {
                list.add(arr[i]);

            }
        }

        // Printing Leader elements
        System.out.println("Leaders elements of the array : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}

/*
 * Appraoch provided by GFG portal with time ans space complexity of O(n^2) and
 * O(1) respectively
 * Second approach
 * 
 * import java.io.*;
 * 
 * public class program {
 * // Java Function to print leaders in an array
 * 
 * void printLeaders(int arr[], int size) {
 * for (int i = 0; i < size; i++) {
 * int j;
 * for (j = i + 1; j < size; j++) {
 * if (arr[i] <= arr[j])
 * break;
 * }
 * if (j == size) // the loop didn't break
 * System.out.print(arr[i] + " ");
 * }
 * }
 * 
 * // Driver program to test above functions
 * public static void main(String[] args) {
 * program lead = new program();
 * int arr[] = new int[] { 16, 17, 4, 3, 5, 2 };
 * int n = arr.length;
 * lead.printLeaders(arr, n);
 * }
 * }
 * 
 */

/*
 * This is the third approach with time and space complexity of O(n ^ 2) and
 * O(1)
 * You solved this youself.
 * import java.util.*;
 * 
 * public class program {
 * 
 * public static void IsLeader(int arr[], int start) {
 * int el = arr[start];
 * int max = 0;
 * for (int i = start + 1; i < arr.length; i++) {
 * if (max < arr[i]) {
 * max = arr[i];
 * }
 * }
 * if (max < el) {
 * System.out.print(el + " ");
 * } else {
 * return;
 * }
 * }
 * 
 * public static void main(String[] args) {
 * int arr[] = { 16, 17, 4, 3, 5, 2 };
 * 
 * // Print the array
 * System.out.println(Arrays.toString(arr));
 * 
 * // Printing Leader elements
 * System.out.println("Leaders elements of the array : ");
 * for (int i = 0; i < arr.length; i++) {
 * IsLeader(arr, i);
 * }
 * 
 * }
 * }
 */

/*
 * Fourth Approach is the most effcient approach with the time and space
 * complexity of O(n) and O(1) respectively
 * Your solved this yourself with a hint from gemini
 * public class LeadersInArray {
 * 
 * public static void printLeaders(int[] arr) {
 * int n = arr.length;
 * 
 * // Traverse from right to left
 * for (int i = n - 1; i >= 0; i--) {
 * boolean isLeader = true;
 * // Check for all elements to the right of the current element
 * for (int j = i + 1; j < n; j++) {
 * if (arr[j] > arr[i]) {
 * isLeader = false;
 * break; // No need to check further elements to the right
 * }
 * }
 * 
 * // If leader, print it
 * if (isLeader) {
 * System.out.print(arr[i] + " ");
 * }
 * }
 * }
 * 
 * public static void main(String[] args) {
 * int[] arr = {16, 17, 4, 3, 5, 2};
 * System.out.println("Leaders in the array: ");
 * printLeaders(arr);
 * }
 * }
 * 
 * You can also use stack in this approach to print the result in the order
 */