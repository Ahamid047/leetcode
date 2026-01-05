package dp;

import java.util.Arrays;

public class printlis {
    public static void main(String[] args) {
        int [] nums={10, 22, 9, 33, 21, 50, 41, 60, 80};
        // int[] nums={10,9,2,5,3,7,101,18};
        int n = nums.length;
        int[] dp = new int[n];

        Arrays.fill(dp, 1);
        
        int ans = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            ans = Math.max(ans, dp[i]);
        }
        System.out.println(ans);

    }
}
