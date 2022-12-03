//Program to check if an array can be partitioned into sub-arrays with equal sum
import java.util.Scanner;
public class PartitionSubArrayIntoEqualSum 
{
    static int findArraySum(int[] arr)
    {
        int totalSum = 0;
        for(int i =0;i<arr.length;i++)
        {
            totalSum=totalSum+arr[i];
        }
        return totalSum;
    }

    static boolean equalSumPartition(int arr[])
    {
        int totalSum = findArraySum(arr);
        int prefSum = 0;
        for(int i=0;i<arr.length;i++)
        {
            prefSum=prefSum+arr[i];
            int suffixSum=totalSum-prefSum;
            if(suffixSum==prefSum)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Equal partition is possible: " + equalSumPartition(arr));

    }
    
}
