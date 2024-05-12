import java.util.Arrays;
public class Binary2DArrayPart3 {
    public static void main(String[] args) {
        int arr[][] = {
                       {1,   2,   3,  4} , 
                       {5,   6,   7,  8} , 
                       {9,  10,  11, 12} , 
                       {13, 14,  15, 16}};

        int target = 2;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    public static int[] BinarySearch(int arr[][], int target, int row, int Cstart, int Cend)
    {
        while(Cstart <= Cend)
        {
           int mid = Cstart + ((Cend - Cstart) / 2);
           if(arr[row][mid] == target)
           {
              return new int[]{row, mid};
           }
           else if(arr[row][mid] > target)
           {
               Cend--;
           }
           else
           {
              Cstart++;
           }
        }
        return new int[]{-1, -1};
    }
    public static int[] search(int arr[][], int target)
    {
        int row = arr.length;
        int col = arr[0].length;
        if(row == 1)
        // If there is single row present then simple Binary Search will be processed where row is fixed
        {
            return BinarySearch(arr, target, row, 0, col - 1);
        }

        int start = 0;
        int end = arr.length - 1;
        int Cmid = col / 2;
        while(start < (end - 1))
        {
            int mid = start + ((end - start) / 2);
            if(arr[mid][Cmid] == target)
            {
                return new int[]{mid, Cmid};
            }
            
            // In 1st half
            if(target <= arr[start][Cmid - 1])
            {
                return BinarySearch(arr, target, start, 0, Cmid - 1);
            }

            // In 2nd half
            if(target >= arr[start][Cmid + 1] && target <= arr[start][col - 1])
            {
                return BinarySearch(arr, target, start, Cmid + 1, col - 1);
            }
            
            // In 3rd half
            if(target <= arr[start + 1][Cmid - 1])
            {
                return BinarySearch(arr, target, start + 1, 0, Cmid - 1);
            }
            else
            {
                return BinarySearch(arr, target, start + 1, Cmid + 1, col - 1);
            }
            
        }
        return new int[]{-1, -1};        
    }
}
