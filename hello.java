import java.util.Arrays;

class hello {
    public static void main(String[] args) {
        int[] arr = {3,5,6,3};
        int [] fresult= productExceptSelf(arr);
        System.out.print(Arrays.toString(fresult));

        // System.out.println(fresult);
    }

    static int[] productExceptSelf(int[] nums) {
        int tpod = 1;
        int[] res = new int[nums.length];

        int j=0;
        for (int num =0;num<nums.length;num++) {
            res[num] = tpod;
            // System.out.println(num);
            tpod *= nums[num];

        }
        int lpod =1;
        // System.out.println(nums.length);
        for (int i = nums.length-1; i >= 0; i--) {

            res[i] *= lpod;

            lpod *= nums[i]; 


            // res[i] = tpod / nums[i];
            // System.out.println(res[i]);

        }

        return res;
    }

}
// [1,1,2,3]
