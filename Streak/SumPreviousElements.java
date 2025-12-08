public class SumPreviousElements {

    static int sumPreviousElements(int[] arr) {
        int runningSum = 0;
        int totalSum = 0;

        // calculate total sum once
        for (int num : arr) {
            totalSum += num;
        }

        int count = 0;

        // prefix sum loop
        for (int i = 0; i < arr.length - 1; i++) {  // IMPORTANT: i < n-1
            runningSum += arr[i];

            int left = runningSum;
            int right = totalSum - runningSum;

            // check if difference is even
            if ((left - right) % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {10,10,3,7,6};
        int result = sumPreviousElements(arr);

        System.out.println(result);
    }
}
