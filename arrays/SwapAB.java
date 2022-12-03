//swap A and B without temp variable
public class SwapAB 
{
    static void swap(int a,int b)
    {
        System.out.println("Original value before swap ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        int temp=a;
        a=b;
        b=a;

        System.out.println("Value after swap ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);


    }

    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        swap(a, b);
    }
    
}
