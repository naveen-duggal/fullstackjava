public class Printo
{
	public static void main(String[] args) {
	    int n=12;
	    int i,j;
	    for(i=0;i<=n;i++)
	    {
	        for(j=0;j<=n;j++)
	        {
	            if( (i==0 && j>n/4 && j<(3*n)/4) || (i==n && j>n/4 && j<(3*n)/4) || (j==0 && i>n/4 && i<(3*n)/4) || (j==n && i>n/4 && i<(3*n)/4) || (i+j==n/4 && i<=n/4 && j<=n/4) || (i-j==(3*n)/4 && i>=(3*n)/4 && j<=n/2) || (j-i==(3*n)/4 && i<=(3*n)/4 && j>=(3*n)/4) || (i+j==n+(3*n)/4 && i>=(3*n)/4 && j>=(3*n)/4) )
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
