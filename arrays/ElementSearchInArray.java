import java.util.Scanner;
public class ElementSearchInArray 
{
    static void searchInArray(int arr[],int n)
    {
        int ans=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                ans=i;
                break;
            }
        }
        if(ans==-1)
        {
            System.out.println("Not found");
        }
        else
        System.out.println("Element found at index " + ans);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ar[] = {23,45,78,21,89,54,61};
        System.out.println("Array: ");
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+ " ");
        }
        System.out.println();
        
        System.out.println("Enter the element to search in the array");
        int ele = sc.nextInt();
        
        //call search element method 
        searchInArray(ar,ele);
        
    }   
}
