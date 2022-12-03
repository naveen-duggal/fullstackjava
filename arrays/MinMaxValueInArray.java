import java.util.Arrays;
import java.util.Scanner;
public class MinMaxValueInArray 
{
    static void minMax(int ar[])
    {
        Arrays.sort(ar);
        System.out.println("Minimum element is " + ar[0]);
        System.out.println("Maximum element is " + ar[ar.length-1]);
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

        minMax(arr);
    }
    
}
