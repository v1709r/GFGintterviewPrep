package Arrays;

import java.util.Arrays;

public class RangeSumMultipleQueries {
    //Description : We are given an Array of n integers, We are given q queries having indices l and r . We have to find out sum between the given range of indices.
    //Input
    //[4, 5, 3, 2, 5]
    //3
    //0 3
    //2 4
    //1 3
    //Output
    //14 (4+5+3+2)
    //10 (3+2+5)
    //10 (5+3+2)

    //The numbers of queries are large. It will be very inefficient to iterate over the array and calculate the sum for each query separately. We have to devise the solution so that we can get the answer of the query in constant time.
    public static void main(String [] args)
    {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int start = 0, end = 4;
        int result = prefixSumDif(arr, start,end);
        System.out.println("Result :"+result);
    }
    private static int prefixSumDif(int [] arr, int start, int end)
    {
        int [] temp = Arrays.copyOf(arr,arr.length);
        for(int i = 1; i<arr.length;i++)
        {
            temp[i] = temp[i-1] + temp[i];
        }
        System.out.println(Arrays.toString(temp));

        if(start == 0)
        {
            return temp[end];
        }
        return temp[end]-temp[start-1];
    }
}
