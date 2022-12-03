import java.util.Scanner;
public class SumArray
{
    static void sumArr(int ar[])
    {
        int sum = 0;
        for(int i=0;i<ar.length;i++)
        {
            sum = sum + ar[i];
        }
        System.out.println("Sum of array is " + sum);
    }
        public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        //take the input in the array
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        sumArr(arr);
        
    }
}