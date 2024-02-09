package Recursion;

public class SumOfNNaturalNumber {
    public static void main(String [] args)
    {
        int n = 2;
        System.out.println(naturalSum(n));
    }

    private static int naturalSum(int n) {
        if(n == 0)
        {
            return 0;
        }
        return n+naturalSum(n-1);
    }
}
