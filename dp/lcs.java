package dp;

import java.util.Arrays;

public class lcs {
    int [][]dp;
    public int fxn(String s1,String s2, int m, int n){

        if(m==0 || n==0)return 0;

        if(dp[m][n]!=-1)return dp[m][n];

        if(s1.charAt(m-1)==s2.charAt(n-1)){
            dp[m][n]=1+ fxn(s1,s2,m-1,n-1);
        }else{
            return dp[m][n]=Math.max(fxn(s1,s2,m,n-1),fxn(s1,s2,m-1,n));
        }

        return dp[m][n];

    }
    public static void main(String[] args) {
        String s1 ="abdul";
        String s2 ="abdullah";

        int m = s1.length();
        int n =s2.length();

        lcs obj = new lcs();
        obj.dp = new int[m+1][n+1];

        for(int i =0;i<=m;i++){
            Arrays.fill(obj.dp[i], -1);
        }

        int res = obj.fxn(s1,s2,m,n);
        System.out.println(res);



    }
}
