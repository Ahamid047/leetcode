package dp;

public class maxprodsubarray {

    public static int maxprod(int[] arr) {
        int maxSoFar = arr[0];
        int minSoFar = arr[0];
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];

            // swap when current is negative
            if (curr < 0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            maxSoFar = Math.max(curr, maxSoFar * curr);
            minSoFar = Math.min(curr, minSoFar * curr);

            result = Math.max(result, maxSoFar);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        // int[] arr = {-2,0,-1};
        System.out.println(maxprod(arr)); // Output: 6
    }
}

