import java.util.Scanner;

public class ArrayIsSortOrNot 
{
    static boolean isSorted(int[] ar)
    {
        boolean check = true;
        for(int i=1;i<ar.length;i++)
        {
            if(ar[i]<ar[i-1])
            {
                check = false;
                break;
            }
        }
        return check;
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
        System.out.println("is Array sorted : "+ isSorted(arr));
    }
    
}
