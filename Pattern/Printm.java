public class Printm
{
	public static void main(String[] args) {
	    int n=10;
	    int i,j;
	    for(i=0;i<=n;i++)
	    {
	        for(j=0;j<=n;j++)
	        {
	            if(j==0 || j==n || (i==j && i<=n/2 && j<=n/2) || (i+j==n && i<=n/2 && j>=n/2) )
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
