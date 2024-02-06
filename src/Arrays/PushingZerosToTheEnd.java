package Arrays;

import java.util.Arrays;

public class PushingZerosToTheEnd {
    public static void main(String [] args)
    {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int wI = 0;
        for(int i = 0; i< arr.length-1; i++)
        {
            if(arr[i] != 0)
            {
                arr[wI] = arr[i];
                wI++;
            }
        }
        for(int i = wI; i<arr.length; i++)
        {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
