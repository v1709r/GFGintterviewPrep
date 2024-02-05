import java.util.Arrays;

public class ArrayDeleteDuplicateItem {
    public static void main(String [] args)
    {
        int [] arr = {10,20,20,30,30,30,30};
        int writeToIndex = 0;
        for(int i = 0; i<arr.length; i++)
        {
           if(i < arr.length-1 && arr[i] == arr[i+1])
           {
               arr[i] = 0;
           }
           else {
               arr[writeToIndex] = arr[i];
               writeToIndex++;
           }
        }
        for(int i = writeToIndex+1; i<arr.length; i++)
        {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
