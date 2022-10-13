import java.util.Scanner;

public class Factorial {
    public static void main(String[] args)
    {
        System.out.println("Factorial program");
        int n,f;
        Scanner fac = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = fac.nextInt();
        while(n!=0)
        {
            f=f*n;
            n--;
        }
        System.out.println("Factorial is "+ f );
    }
}
