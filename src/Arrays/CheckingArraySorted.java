package Arrays;

public class CheckingArraySorted {
    public static void main(String [] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,8};
        System.out.println(checkSorted(arr));
    }
    private static boolean checkSorted(int[] arr)
    {
        boolean flag = true;
        int n = arr.length;
        if(arr[0] < arr[n-1])
        {
            for(int i = 0; i<n-1; i++)
            {
                if(arr[i] > arr[i+1])
                {
                    flag = false;
                    break;
                }
            }
        }
        if(arr[0] > arr[n-1])
        {
            for(int i = 0; i<n-1; i++)
            {
                if(arr[i] < arr[i+1])
                {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
