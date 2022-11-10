public class Printr
{
	public static void main(String[] args) {
	    int n=12;
	    int i,j;
	    for(i=0;i<=n;i++)
	    {
	        for(j=0;j<=n;j++)
	        {
	            if( j==0 || (i==0 && j<n/2) || (i==n/2 && j<n/2) || (j==n/2 && i>0 && i<n/2) || (i-j==n/2 && i>n/2 && j<=n/2))
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
