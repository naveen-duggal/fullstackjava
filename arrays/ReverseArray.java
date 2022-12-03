//Program to reverse the array
import java.util.Scanner;
public class ReverseArray 
{
    /* 
    //method to reverse the array with the help of second array
    static int[] reverseArray(int[] arr)
    {
        int n=arr.length;
        int [] ans = new int[n];
        int j = 0;

        //traverse original array in reverse direction

        for(int i=n-1;i>=0;i--)
        {
            ans[j]=arr[i];
            j++;
        }
        return ans;
    }
    */

    //method to swap in array
    static void swapInArray(int ar[],int x,int y)
    {
        int temp=ar[x];
        ar[x]=ar[y];
        ar[y]=ar[x];

    }

    //method to reverse the array without the help of second array
    static void reverseArray2(int[] arr)
    {
        int i=0;
        int j=arr.length-1;

        while(i<j)
        {
            swapInArray(arr,i,j);
            i++;
            j--;
        }
    }
    //print array function
    static void printArray(int ar[])
    {
        int n=ar.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i] + " ");
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

        reverseArray2(arr);
        printArray(arr);
    }
    
}
