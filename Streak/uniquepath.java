import java.util.Arrays;

public class uniquepath {
    int fun(int m,int n, int cr,int cc, int[][] dp){
        if(cr>=m || cc>=n) return 0;
        if(cr==m-1 && cc==n-1) return 1;
        if(dp[cr][cc] != -1) return dp[cr][cc];
        int left = fun(m,n, cr+1, cc, dp);
        int right =fun(m,n, cr,cc+1, dp);
        return dp[cr][cc] = left +right;

    }
    public int uniquePaths(int m, int n) {
        int[][] dp= new int[m][n];
        for(int i =0;i<m;i++){
            Arrays.fill(dp[i],-1); 
            System.out.println(Arrays.toString(dp));
        }
        // for(int i=0;i<dp.length;i++){

        //     System.out.println(Arrays.toString(dp));
        // }
        return fun(m,n,0,0, dp);
        


    }
}

