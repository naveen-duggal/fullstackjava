//find the last occurrence of element in the array
import java.util.Scanner;
public class LastOccurOfXInArray 
{
    static void lastOccurrence(int ar[],int x)
    {
        int lastIndex=-1;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==x)
            {
                lastIndex=i;
            }
        }
        if(lastIndex==-1)
        {
            System.out.println("Not found");
        }
        else
        {
            System.out.println("Last occurence of element " + x + " is found at index " + lastIndex);
        }
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
        
        System.out.println("Enter the element x to check last occurrence");
        int last = sc.nextInt();

        //call method lastOccurrence
        lastOccurrence(arr,last);
    }
    
}
