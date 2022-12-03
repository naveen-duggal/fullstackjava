//Sort an array consisting of only 0s and 1s
public class SortArray01 
{
    /*static void sortZeroAndOnes(int[] arr)
    {
        int n= arr.length;
        int zeroes = 0;
        //count number of zeros
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                zeroes++;
            }
        }

        for(int i=0;i<n;i++)
        {
            if(i<zeroes)
            {
                arr[i]=0;
            }
            else
            {
                arr[i]=1;
            }
        }
    } */

    //swap array function
    static void swap(int arr[],int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    //one another method to sort
    static void sortZeroesAndOnes(int[] arr)
    {
        int n= arr.length;
        int left = 0,right= n-1;

        while(left<right)
        {
            if(arr[left]==1 && arr[right]==0)
            {
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0)
            {
                left++;
            }
            if(arr[right]==1)
            {
                right--;
            }
        }
    }
    public static void main(String[] args)
    {   
        int arr[] = {0,1,1,0,1,0,0,1,1,1,0,1,0,0,1,0};  
        sortZeroesAndOnes(arr);
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    
}

//This code is contributed by Naveen Duggal...