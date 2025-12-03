
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class diceCombination {
    static long fun(int n, long[] dp){
        if(n==0) return 1;
        if(n<0 ) return 0;
        if(dp[n]!=-1 )return dp[n]%(int)(1e9+7);
        dp[n]=0;
        for(int i=1;i<=6;i++){
            dp[n]+= fun(n-i,dp)%(int)(1e9+7);
        } 
        return dp[n]%(int)(1e9+7);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        long[] dp = new long[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fun(n,dp)); 
    }
}
