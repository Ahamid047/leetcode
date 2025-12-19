public class SubsetSum {
    public static void main(String[] args) {
        int[] nums={2,5,1,6};
        int target =8;
        boolean[][] dpt = new boolean[nums.length][target+1];
        for(int i = 0; i < nums.length; i++){
            dpt[i][0] = true;
        }
        if (nums[0] <= target) dpt[0][nums[0]] = true;
        for(int i = 1; i < nums.length; i++){
            for(int j = 1; j <= target; j++){
                boolean in = false;
                if(nums[i] <= j) in = dpt[i-1][j-nums[i]];
                boolean ex = dpt[i-1][j];
                dpt[i][j] = in || ex;
            }
        }
        System.out.println(dpt[nums.length - 1][target]);
    }
}
