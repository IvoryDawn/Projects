// This is a java program to find ceiling of a number

import java.util.Scanner;
public class Ceiling 
{

    //This returns the index of smallest of the greater or equal to target
    public static int FindCeiling(int arr[], int target, int n)
    {
        int start = 0;
        int end = n - 1; 

        // When target is greater than the greatest element of the array
        // Or when the target is smaller than smallest of the array
        if(target > arr[end] || target < arr[start])
        {
            return -1;
        }
        
        while(start <= end)
        {
            int mid = start + ((end - start) / 2);
            if(target > arr[mid])
            {
                start = mid + 1;
            }
            else if(target < arr[mid])
            {
                end = mid - 1;
            }
            else
            {
                return mid;  // Target found
            }
        }

        // Returns start when condition is violated
        return start;
    }

    public static void main(String[] args) 
    {
        // Taking input using Scanner class
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        System.out.println("Enter the elements into the array : ");
        int arr[] = new int[n];
        for(int i = 0; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        // Sort the array
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
        
        // Inputting target number
        System.out.println("Enter your target number : ");
        int target = sc.nextInt();

        // Finding Ceiling Number
        int Ceiling  = FindCeiling(arr , target, n);
        if(Ceiling != -1)
        {
            System.out.println("Ceiling of "+target+" is "+arr[Ceiling]+" at index "+Ceiling);
        }
        else
        {
            System.out.println("Target is out of range");
        }

        sc.close();
    }
}