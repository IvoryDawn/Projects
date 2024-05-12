public class SplitArraySum
{
    public static void main(String args[])
    {
        int arr[] = {7, 2, 5, 8, 10};
        int k = 2;
        System.out.println(SplitSum(arr, k));
    }
    public static int SplitSum(int[] arr, int k)
    {
        int start = 0;
        int end = 0;
        for(int i = 0; i < arr.length; i++)
        {
            start = Math.max(start, arr[i]); // This will store the largest element of the array
            end += arr[i]; // This will store the sum of the whole array
        }
        
        while(start < end)
        {
            int mid = start + ((end - start) / 2);

            int sum = 0;
            int pieces = 1;
            for(int nums : arr)
            {
                if(sum + nums > mid)
                {
                    sum = nums;
                    pieces++;
                }
                else
                {
                    sum += nums;
                }
            }

            if(pieces > k)
            {
                start = mid + 1;
            }
            else
            {
                end = mid;
            }
        }
        return end;
    }
}