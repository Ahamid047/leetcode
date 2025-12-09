
import java.util.Arrays;

public class uniqquepath {

    int fun(int m, int n, int cr, int cc, int[][] dp) {
        if (cr >= m || cc >= n) return 0;
        if (cr == m - 1 && cc == n - 1) return 1;
        if (dp[cr][cc] != -1) return dp[cr][cc];

        int down = fun(m, n, cr + 1, cc, dp);
        int right = fun(m, n, cr, cc + 1, dp);

        return dp[cr][cc] = down + right;
    }

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return fun(m, n, 0, 0, dp);
    }

    public static void main(String[] args) {
        uniqquepath up = new uniqquepath();
        int m = 3;
        int n = 7;

        int result = up.uniquePaths(m, n);
        System.out.println("Unique Paths = " + result);
    }
}
