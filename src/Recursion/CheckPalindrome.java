package Recursion;

public class CheckPalindrome {
    public static void main(String [] args)
    {
        String str = "aba";
        System.out.println(check(str,str.length()-1,0));
    }

    // You can also perform short-circuiting, in which the if condition will only check for the next condition if the first condition is tru and won check for the other condition if the first is not true.
    private static boolean check(String str, int end, int start) {
        // if odd, the start and end will be the same and thus, it will be true
        if(start>=end)
        {
            return true;
        }
        return str.charAt(start) == str.charAt(end) && check(str, end - 1, start + 1);
    }

//    private static boolean check(String str, int n, int x) {
//        if(x>n)
//        {
//            return true;
//        }
//        if(str.charAt(x) == str.charAt(n))
//        {
//            return check(str,n-1,x+1);
//        }
//        return false;
//    }
}
