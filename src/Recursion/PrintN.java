package Recursion;

public class PrintN {
    public static void main(String [] args)
    {
        int x= 5;
        // print n to 1
        printN(x);

        System.out.println();

        // print 1 to n
        printOne(x, 1);
    }

    private static void printOne(int n, int k)
    {
        // Recursive Tail Call
        if(n == 0)
            return;
        System.out.print(k);
        printOne(n-1,k+1);
        // Non Recursive Tail
//        if(n == 0)
//        {
//            return;
//        }
//        printOne(n-1);
//        System.out.print (n);
    }

    private static void printN(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.print(n);
        printN(n-1);
    }

    // Brute Force, but tail recursive calling
//    private static void printOne(int num, int n)
//    {
//        if(n == num+1)
//        {
//            return;
//        }
//        System.out.print(n);
//        printOne(num,n+1);
//    }
}
