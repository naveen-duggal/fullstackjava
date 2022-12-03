public class PairSum 
{
    static int pairSum(int ar[],int tar)
    {
        int n= ar.length;
        int ans = 0;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(ar[i]+ar[j]==tar)
                {
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[] = {6,5,7,3,4,8,9,1,2};
        int target = 9;

        System.out.println("Total pair in the array " + pairSum(arr, target));
    }
    
}
