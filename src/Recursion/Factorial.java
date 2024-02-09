package Recursion;

public class Factorial {
    public static void main(String [] args)
    {
        int result;
        int n = 5;
        result = fac(n);
        System.out.println(result);
    }
    public static int fac(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        return n*fac(n-1);
    }
}
