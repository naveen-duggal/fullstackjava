//Rotate the array 'k' steps without second array
import java.util.*;
import java.util.Scanner;
public class RotateArray
{

    static void swap(int ar[],int i,int j)
    {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    static void reverse(int[] arr, int i, int j)
    {
        while(i<j)
        {
            swap(arr,i,j);
            i++;
            j--;
        }
    }   

    static void rotationInPlace(int ar[],int k )
    {
        int n = ar.length;
        k=k%n;
        reverse(ar,0,n-k-1);
        reverse(ar, n-k, n);
        reverse(ar, 0, n-1);
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

        rotationInPlace(arr, k);
        printArray(arr);
    }
    
}
