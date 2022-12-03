//program to find the first repeating element in the array
import java.util.Scanner;
public class FirstRepeatNumber 
{
    static int firstRepeatingNumber(int[] arr)
    {
        int n = arr.length;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    return arr[i];
                }
            }
        }
        return -1;
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
        System.out.println("First repeating number is " + firstRepeatingNumber(arr));

    }
}
