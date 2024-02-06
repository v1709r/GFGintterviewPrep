package Recursion;

public class BinaryEqiOfNum {
    public static void main(String [] args)
    {
        int n = 1;
        binaryEqi(n);
    }
    private static void binaryEqi(int n)
    {
        if(n == 0)
        {
            return;
        }
        binaryEqi(n/2);
        System.out.print(n%2);
    }
}
