public class Printv
{
	public static void main(String[] args) {
	    int n=14;
	    int i,j;
	    for(i=0;i<=n;i++)
	    {
	        for(j=0;j<=n;j++)
	        {
	            if( (i==j && i<=n/2 && j<=n/2 )|| (i+j==n && i<=n/2 && j>=n/2))
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
