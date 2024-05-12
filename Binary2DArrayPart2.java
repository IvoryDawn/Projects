public class Binary2DArrayPart2 {
    public static void main(String[] args) {
        int arr[][] = {{10, 20, 30, 40} , {15, 25, 35, 45} , {28, 29, 37, 49} , {33, 34, 38, 50}};
        int target = 35;
        int r = 0;
        int c = arr.length - 1;
        boolean found = false;
        while(r <= arr.length - 1 && c >= 0)
        {
            if(target == arr[r][c])
            {
                found = true;
                System.out.println("Target found at [ " + r + " , " + c + " ]");
                return;
            }
            else if(target > arr[r][c])
            {
                r++;
            }
            else
            {
                c--;
            }
        }
        if(!found)
        {
            System.out.println("Target not found");
        }
    }
}