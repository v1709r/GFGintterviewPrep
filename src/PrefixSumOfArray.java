import java.util.Arrays;

public class PrefixSumOfArray {
    public static void main(String [] args)
    {
        int [] arr = {1,2,3,4,5};
        int n = arr.length;

        // Optimised
        for(int i = 1; i< arr.length; i++)
        {
            arr[i] += arr[i-1];
        }
        System.out.println(Arrays.toString(arr));

        // Brute Force
//        int [] PS = new int[arr.length];
//        PS[0] = arr[0];
//        for(int i = 1; i< arr.length; i++)
//        {
//            PS[i] = PS[i-1] + arr[i];
//        }
//        System.out.println(Arrays.toString(PS));
    }
}
