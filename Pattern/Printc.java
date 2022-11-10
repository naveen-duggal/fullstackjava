public class Printc
{
	public static void main(String[] args) 
    {
	    int n=18;
	    int i,j;
	    for(i=0;i<=n;i++)
	    {
	        for(j=0;j<=n;j++)
	        {
	            if((j==0 && i!=0 && i!=n) || (i==0 && j!=0 && j<n/2) || (i==n && j!=0 && j<n/2) || (j==n/2 && i<=n/4 && i>0) || (j==n/2 && i>(3*n)/4 && i<n) )
	            {
	                System.out.print(" *");
	            }
	            else
	            {
	                System.out.print("  ");
	            }
	        }
	        System.out.print("\n");
	    }
		
	}
}
