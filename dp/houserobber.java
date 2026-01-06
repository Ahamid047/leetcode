package dp;

import java.util.Arrays;

public class houserobber {
    public static int maxloot(int[]arr, int i, int[]dp){
        if(i>=arr.length)return 0;
        if(dp[i]!=-1)return dp[i];
        int steal = arr[i]+maxloot(arr, i+2,dp);
        int skip = maxloot(arr,i+1,dp);
        return dp[i]=Math.max(skip,steal);


    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,1};
        int [] dp = new int[arr.length];
        Arrays.fill(dp,-1);
        int res= maxloot(arr,0,dp);
        System.out.println(res);
        
    }
}

//Through recursion give time limit exceeds

// package dp;

// public class houserobber {
//     public static int maxloot(int[]arr, int i){
//         if(i>=arr.length)return 0;
//         int steal = arr[i]+maxloot(arr, i+2);
//         int skip = maxloot(arr,i+1);
//         return Math.max(skip,steal);
//     }
    
//     public static void main(String[] args) {
//         int[] arr ={6, 7, 1, 3, 8, 2, 4};
//         int res= maxloot(arr,0);
//         System.out.println(res);
        
//     }
// }
