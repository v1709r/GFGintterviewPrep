package Arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String [] args)
    {
        int[] arr1 = {1,7,8,9,10};
        int[] arr2 = {6,2,3,4,5};
        int[] sum = new int[arr1.length+arr2.length];
        int i = 0, j = 0, k = 0, a1 = arr1.length, a2= arr2.length;
        while(i<a1 && j<a2)
        {
            if(arr1[i] < arr2[j])
            {
                sum[k++] = arr1[i++];
            }
            else{
                sum[k++] = arr2[j++];
            }
        }
        while(i<a1)
        {
            sum[k++] = arr1[i++];
        }
        while(j<a2)
        {
            sum[k++] = arr2[j++];
        }
        System.out.println(Arrays.toString(sum));
    }
}