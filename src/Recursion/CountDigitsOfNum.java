package Recursion;

public class CountDigitsOfNum {
    public static void main(String [] args)
    {
        int n = 12;
        System.out.println(count(n,0));
    }
    public static int count(int n, int c)
    {
        System.out.println(c);
        if(n == 0)
        {
            return c;
        }
        return count(n/10,c+1);
    }
}
