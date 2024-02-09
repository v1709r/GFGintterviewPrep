package Recursion;

public class nThFibonacciNumb {
    public static void main(String []args)
    {
        //0,1,1,2,3,5,8,13,21,34,55
        int x = 1;
        System.out.println(febNum(x,0,1));
        System.out.println(febNum(x));
        // 2 more approaches
    }

    private static int febNum(int x, int a, int b) {
        if(x == 1 || x<1)
        {
            return a;
        }
        int temp = b;
        b = a+b;
        a = temp;
        return febNum(x-1,a,b);
    }

    private static int febNum(int x) {
        // or course way:
        if(x<=1)
        {
            return x;
        }
        return febNum(x-1)+febNum(x-2);
    }

    // third approach is to use the memoization technique....
}
