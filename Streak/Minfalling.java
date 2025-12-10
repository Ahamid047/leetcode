
import java.util.Arrays;

public class Minfalling {
    static int fun(int[][]matrix, int cr, int cc, int[][]dp){
        if(cc<0 || cc>=matrix.length) return Integer.MAX_VALUE;
        if(cr == matrix.length-1 ){
            return matrix[cr][cc];
        }
        if(dp[cr][cc]!= Integer.MIN_VALUE) return dp[cr][cc];
        int downLeft = fun(matrix, cr+1, cc-1, dp);
        int down = fun(matrix, cr+1, cc, dp);
        int downRight = fun(matrix, cr+1, cc+1, dp);
        
        int sum = matrix[cr][cc] + Math.min(downLeft, Math.min(down, downRight));
        
        return dp[cr][cc] = sum;


    }
    public static void main(String args[]){
        int [][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        int n= matrix.length;
        int [][]  dp =new int[n][n];
        for (int i = 0; i < n ; i++) {
            Arrays.fill(dp[i],Integer.MIN_VALUE);
            
        }
        int ans = Integer.MAX_VALUE;
        for(int col = 0; col < n; col++){
            ans = Math.min(ans, fun(matrix, 0, col, dp));
        }

        System.out.println(ans);
        
    }
}
