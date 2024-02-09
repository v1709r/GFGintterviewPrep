package Recursion;

public class MaxRopePieces {
    public static void main(String [] args)
    {
        int n = 5;
        int a = 2;
        int b = 3;
        int c = 1;
        System.out.println(maximum(a,b,c));
        System.out.println(cutRope(n,a,b,c));
    }

    private static int cutRope(int n, int a, int b, int c) {
//        smallest(a,b,c);
        if( n == 0)
        {
            return 0;
        }
        if(n < 0)
        {
            return -1;
        }
        int max = maximum(
                        cutRope(n-a,a,b,c),
                        cutRope(n-b,a,b,c),
                        cutRope(n-c,a,b,c)
        );
        if(max == -1)
        {
            return -1;
        }
        return max+1;
    }

    private static int maximum(int i, int i1, int i2) {
        if(i > i1 && i > i2)
        {
            return i;
        }
        else if(i1 > i && i > i2)
        {
            return i1;
        }
        else{
            return i2;
        }
    }
}
