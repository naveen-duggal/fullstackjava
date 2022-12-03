public class MaxValueArray 
{
    static void maxValue(int arr[])
    {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Maximum value is "+ max);

    }
    public static void main(String[] args)
    {
        int ar[] = {34,67,21,89,52,72};
        maxValue(ar);
    }
    
}
