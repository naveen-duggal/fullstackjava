//For a given array of integers of size n, answer q queries to print the sum of values in a given range of indices from left to right

import java.util.Scanner;
public class RangeQueryPrefixSumArray 
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
        System.out.println("Enter the number of queries ");
        int q = sc.nextInt();

        while(q-- > 0)
        {
            System.err.println("Enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int an = ans[r] - ans[l-1];

            System.out.println("Sum " + an);
        }

    }
    
}
