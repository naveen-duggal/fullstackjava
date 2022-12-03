//Program to count the number of triplets whose sum is equal to the given value x
import java.util.Scanner;
public class TripletSum 
{
    static int triplet(int ar[],int target)
    {
        int ans=0;
        int n= ar.length;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(ar[i]+ar[j]+ar[k]==target)
                    {
                        ans++;
                    }
                }
            }
        }
        return ans;
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

        System.out.println("Enter the target value sum of three elements in the array");
        int sum = sc.nextInt();

        System.out.println("Pair of sum of triplet in the array to target value is " + triplet(arr, sum));
    }
    
}
