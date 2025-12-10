public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int tpod = 1;
        int[] res = new int[nums.length];

        for (int num : nums) {
            res[num] = tpod;
            tpod *= num;


        }
        System.out.println(res);
        for (int i = 0; i < nums.length; i++) {
            // res[i] = tpod / nums[i];
            System.out.println(res[i]);

        }
        return res;
    }

}
// [1,1,2,3] {
    
}
