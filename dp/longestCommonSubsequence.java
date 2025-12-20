package dp;

import java.util.Arrays;

public class longestCommonSubsequence {

    static int lcs(String s1, String s2, int m, int n, int[][] dp) {
        // Base case
        if (m < 0 || n < 0) {
            return 0;
        }

        // If already computed
        if (dp[m][n] != -1) {
            return dp[m][n];
        }

        // If characters match
        if (s1.charAt(m) == s2.charAt(n)) {
            dp[m][n] = 1 + lcs(s1, s2, m - 1, n - 1, dp);
        } else {
            dp[m][n] = Math.max(
                lcs(s1, s2, m - 1, n, dp),
                lcs(s1, s2, m, n - 1, dp)
            );
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";

        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        int result = lcs(text1, text2, m - 1, n - 1, dp);
        System.out.println("Longest Common Subsequence Length: " + result);
    }
}


// package dp;

// public class longestCommonSubsequence {

//     static int lcs(String s1, String s2, int m, int n) {
        
//         if (m == 0 || n == 0) {
//             return 0;
//         }

//         if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
//             return 1 + lcs(s1, s2, m - 1, n - 1);
//         }

//         return Math.max(
//             lcs(s1, s2, m - 1, n),
//             lcs(s1, s2, m, n - 1)
//         );
//     }

//     public static void main(String[] args) {
//         String text1 = "abde";
//         String text2 = "ace";

//         int m = text1.length();
//         int n = text2.length();

//         int result = lcs(text1, text2, m, n);
//         System.out.println("Longest Common Subsequence Length: " + result);
//     }
// }
