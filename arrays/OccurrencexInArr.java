//Program to count the occurrence of element in the array
import java.util.Scanner;
public class OccurrencexInArr 
{
    static void countOccurrences(int ar[],int x)
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==x)
            {
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("Not found");
        }
        else
        System.out.println("Element "+ x + " is present in the array " + count + " times");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elemnts in the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the element to check the occurrence in the array: ");
        int x = sc.nextInt();

        countOccurrences(arr,x);

    }
    
}
