// This java program finds floor if a number in an array
import java.util.*;
public class Floor 
{

    //This returns the index of greatest of the smaller or equal to target
    public static int FindFloor(int arr[], int target, int n)
    {
        int start = 0;
        int end = n - 1;
        // When target is greater than greatest element of the array
        // Or when the target is smaller than smallest of the array
        if(target > arr[end] || target < arr[start])
        {
            return -1;
        }
        while(start <= end)
        {
            int mid = start + ((end - start) / 2);
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        //When while loop condition is violated
        return end;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in the array : ");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        //Sort the array
        for(int i = 0 ; i < n - 1 ; i++)
        {
            for(int j = 0 ; j < n - 1 - i ; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Taking target numbebr as input
        System.out.println("Enter your target number : ");
        int target = sc.nextInt();

        // Prints the floor of number in the array
        int floor = FindFloor(arr, target, n);
        if(floor != -1)
        {
            System.out.println("Floor of "+target+" is "+arr[floor]+" at index "+floor);
        }
        else
        {
            System.out.println("Target is out of range");
        }
        
        sc.close();
    }
}