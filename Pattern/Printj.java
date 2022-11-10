public class Printj
{
	public static void main(String[] args) {
	    int n=10;
	    int i,j;
	    for(i=0;i<=n;i++)
	    {
	        for(j=0;j<=n;j++)
	        {
	            if( (i==0 ) || (j==n/2 && i<n) || (i==n && j>0 && j<n/2) || (j==0 && i>=n/2 && i<n) )
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
