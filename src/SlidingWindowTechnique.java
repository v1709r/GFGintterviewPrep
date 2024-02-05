public class SlidingWindowTechnique {
    public static void main(String [] args)
    {
        // Applied on the question: When need the largest sum of k consecutive number. We can use brute force and solve it by checking and adding every block. Solving in O(n^2).
        // A better approach is to use sliding window approach to solve in Linear amount of time.
        int [] arr = {50, 1, 4, 2, 10, 23, 3, 1, 0, 20, 50, 50};
        int k = 4;
        int sum = 0, temp = 0;
        int setPose = 0;
        for(int i = 0; i<k; i++)
        {
            sum += arr[i];
        }
        temp = sum;
        for(int i = 0; i<arr.length-k; i++)
        {
            temp = temp - arr[i] + arr[i+k];
            if(sum < temp)
            {
                setPose = i+1;
                sum = temp;
            }
        }
        for(int i = setPose; i<setPose+k; i++)
        {
            System.out.print("Item: "+arr[i]);
        }


        //Brute force
//        int x;
//        int sum = 0, temp = 1;
//        for(int i = 0; i<=arr.length-k; i++)
//        {
//            x = 0;
//            temp = 0;
//            while(x<k)
//            {
//                temp += arr[i+x];
//                x++;
//            }
//            if(temp > sum)
//            {
//                sum = temp;
//            }
//        }
        System.out.println(sum);
    }
}
