//Program to find the second largest element in the array
import java.util.Scanner;
public class SecondLargest 
{
    static int findMax(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }

    static int findSecondMax(int[] arr)
    {
        int mx = findMax(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==mx)
            {
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
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

        System.out.println("Second largest element in the array: " + findSecondMax(arr));

    }
    
}
