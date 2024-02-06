package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String [] args)
    {
//        int [] arr = {1, 2, 2, 3, 4, 7, 9, 10, 13, 16, 18, 18, 19, 20, 20, 20, 22, 24, 25, 25, 27, 28, 29, 29, 30, 30, 32, 33, 35, 35, 40, 40, 41, 41, 42, 42, 45, 46, 47, 50, 51, 52, 53, 54, 56, 57, 57, 65, 65, 66, 66, 68, 68, 69, 71, 71, 72, 72, 76, 79, 80, 81, 82, 84, 87, 87, 87, 89, 90, 93, 94, 95, 96, 97, 98, 98, 98};
//        int n = arr.length;
//        int d = 69;
        int [] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int d = 2;
        d = d%n;

        //ClockWise
        revArr(arr,0,n-1);
        revArr(arr,0,d-1);
        revArr(arr,d,n-1);
        System.out.println(Arrays.toString(arr));

        //AntiClockWise
        revArr(arr,0,d-1);
        revArr(arr,d,n-1);
        revArr(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    static void revArr(int[] arr, int start, int end)
    {
        int temp;
        while(start<end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

        // Brute Force
//        int []  arr2 = new int [arr.length];
//        int j, i;
//        for( j = 0, i = t; i < n; i++, j++)
//        {
//            arr2[j] = arr[i];
//        }
//        for(i = 0; i < t; i++, j++ )
//        {
//            arr2[j] = arr[i];
//        }
//        arr = arr2;
}
