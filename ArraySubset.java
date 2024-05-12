import java.util.*;

class Compute {
    public static void main(String[] args) {
        long a1[] = { 11, 7, 1, 13, 21, 3, 7, 3 };
        long a2[] = { 11, 3, 7, 1, 7 };
        System.out.println(isSubset(a1, a2, a1.length, a2.length));
    }

    public static String isSubset(long a1[], long a2[], long n, long m) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a2[i] == a1[j]) {
                    a1[j] = -1;
                    arr.add((int) a2[i]);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a1[i] + " ");
        }
        System.out.println();
        if (arr.size() == m) {
            return "Yes";
        }
        return "No";
    }
}