//In an array 'a' move all even integers at the beginning followed by all odd integers
import java.util.Scanner;
public class SortArrayAllEvenFirstAndOddLastPosition 
{
    //swap array function
    static void swap(int arr[],int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    //one another method to sort
    static void sortEvenFirstOddLast(int[] arr)
    {
        int n= arr.length;
        int left = 0,right= n-1;

        while(left<right)
        {
            if(arr[left]%2==1 && arr[right]%2==0)
            {
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0)
            {
                left++;
            }
            if(arr[right]%2==1)
            {
                right--;
            }
        }
    }

    //print array function
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
        sortEvenFirstOddLast(arr);
        printArray(arr);
    }
    
}

//This code is contributed by Naveen Duggal...
