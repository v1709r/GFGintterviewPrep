package Arrays;

public class SecondLargestElement {
    public static void main(String [] args)
    {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int lar = arr[0];
        int secLar = arr[0];
        for(int i = 1; i<arr.length; i++)
        {
            if(lar < arr[i])
            {
                secLar = lar;
                lar = arr[i];
            }
            if(arr[i] > secLar && arr[i] < lar)
            {
                secLar = arr[i];
            }
        }
        System.out.println(secLar);
    }
}
