public class Binary2DArrayPart1 {
    public static void main(String[] args) {
        int arr[][] = {{10, 20, 30, 40} , {15, 25, 35, 45} , {28, 29, 37, 49} , {33, 34, 38, 50}};
        int row = arr.length;
        int target = 35;
        Search(arr, row, target);
    }
    public static void Search(int[][] arr, int row, int target)
    {
        boolean found = false;
        for(int i = 0; i < row ; i++)
        {
            int start = 0;
            int end = arr.length - 1;
            while(start <= end)
            {
                int mid = start + ((end - start) / 2);
                if(target == arr[i][mid])
                {
                   found = true;
                   System.out.println("Target found at [ " + i + " , " + mid + " ]");
                   return;
                }
                else if(target > arr[i][mid])
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid - 1;
                }
            }
        }
        if(found == false)
        {
            System.out.println("Target not found");
        }
    }
}
