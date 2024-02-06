package Arrays;

public class LargestSumArray {
    public static void main(String [] args)
    {
        int[] arr = {3,-3, 4, -1, -2, 1, 5};
        int result = largestSumArray(arr, arr.length);
        System.out.println(result);
    }
    public static int largestSumArray(int[] arr, int n) {
        //BruteForce:
        int sum = 0;
//        int position= -1;
        int temp = 0;
        for(int i = 0; i<n; i++)
        {
            temp += arr[i];
            if(temp<0)
            {
                temp = 0;
            }
            if(temp > sum)
            {
                sum = temp;
            }
        }
        return sum;
    }
}
