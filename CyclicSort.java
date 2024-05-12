public class CyclicSort {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 2, 1, 4 };
        sort(arr);
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " , ");
        }
        System.out.print(arr[arr.length - 1]);
        System.out.print("]");
    }

    public static void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i] - 1) {
                continue;
            } else {
                swap(arr, i, arr[i] - 1);
            }
        }
    }

    public static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
