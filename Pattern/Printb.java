public class Printb
{
	public static void main(String[] args) {
	    int n=11;
	    int i,j;
	    for(i=0;i<=n;i++)
	    {
	        for(j=0;j<=n;j++)
	        {
	            if((i==0 && j<(n-1)/2) || (i==(n-1)/2 && j<(n-1)/2) || (i==n && j<(n-1)/2) || j==0 || (j==(n-1)/2 && i>0 && i!=(n-1)/2 && i!=n))
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
