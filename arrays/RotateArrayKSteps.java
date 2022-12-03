//Rotate the array 'k' steps
import java.util.Scanner;
public class RotateArrayKSteps 
{
    static int[] rotate(int[] arr, int k)
    {
        int n = arr.length;
        k=k%n;
        int [] ans = new int[n];
        int j=0;

        for(int i=n-k;i<n;i++)
        {
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++)
        {
            ans[j++]=arr[i];
        }
        return ans;
    }

    //print the array function
    static void printArray(int ar[])
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i] + " ");
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

        System.out.println("Enter the k steps to rotate the array");
        int k = sc.nextInt();

        int ans[] = rotate(arr, k);
        System.out.println("After rotating the array:");

        printArray(ans);

    }
    
}
