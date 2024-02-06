package Arrays;

import java.util.Arrays;

public class MovingZeros {
    public static void main(String [] args) {
        int[] arr = {8, 5, 0, 2, 0, 0, 0, 3};
        int n = arr.length;
        int writeToIndex = 0;
        int temp;
        for(int i = 0; i<n; i++)
        {
            if(arr[i] != 0)
            {
                temp = arr[i];
                arr[i] = 0;
                arr[writeToIndex] = temp;
                writeToIndex++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}