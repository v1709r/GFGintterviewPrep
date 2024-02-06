package Arrays;

public class EquilibriumIndexOfArray {
    public static void main(String [] args)
    {
        //Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes. We are given an Array of integers, We have to find out the first index i from left such that -
        //Input
        //[-7, 1, 5, 2, -4, 3, 0]
        //Output
        //3 (index or '2')
        //A[0] + A[1] + A[2] = A[4] + A[5] + A[6]

        // Brute force: Didn't try. [Idea to start from center and loop left and right to find the sums. Compare sums, if left greater, then move left one step, else towards right and compare again (can simply add/remove elements to the sum)]


        // O(N) solution: Sum the whole. Iterate from the left, and keep removing from the sum
//        int [] arr = {-7, 1, 5, 2, -4, 3, 0};
        int [] arr = {1,2,3,1,2};
        int result = eqi(arr,arr.length);
        System.out.println(result);
    }
    private static int eqi(int [] arr, int n)
    {
        int sum = 0;
        int leftmost = 0;
        for(int i = 0; i<n; i++)
        {
            sum += arr[i];
        }
        for(int i = 0; i<n; i++)
        {
            sum -=arr[i];
            if(leftmost == sum)
            {
                return i;
            }
            leftmost += arr[i];
        }
        return -1;
    }
}
