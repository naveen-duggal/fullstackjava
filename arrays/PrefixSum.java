//Given an integer array 'a', return the prefix sum/running sum in the same array

import java.util.Scanner;
public class PrefixSum 
{
    static int[] makePrefixSumArray(int[] arr)
    {
        int n=arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for(int i=1;i<n;i++)
        {
           prefix[i]=prefix[i-1] + arr[i]; 
        }
        return prefix;
    }

    //method to print array
    static void printArray(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements in the array: ");
        for(int i = 0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans[] = makePrefixSumArray(arr);
        printArray(ans);
    }
    
}

//This code is contributed by Naveen Duggal
