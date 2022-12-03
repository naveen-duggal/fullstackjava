// For an array 'a' sorted in non-decreasing order, return an array of squares of each number sorted in non-decreasing order
import java.lang.Math;
import java.util.Scanner;
public class SquareOFsortedArray 
{
    static int[] sortSquares(int[] arr)
    {
        int n = arr.length;
        int left = 0, right = n-1;
        int[] ans = new int[n];
        int k = 0;
        
        while(left<=right)
        {
            if(Math.abs(arr[left]) > Math.abs(arr[right]))
            {
                ans[k++]=arr[left]*arr[left];
                left++;
            }
            else
            {
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }

        return ans;
    }

    //print array method
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
        System.out.println("Enter the elements in the array in sorted from it may be positive or negative but in sorted order: ");
        for(int i = 0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        int[] ans = sortSquares(arr);
        printArray(ans);
    }
    
}

//This code is contributed by Naveen Duggal...