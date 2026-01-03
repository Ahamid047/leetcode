package dp;

public class fibo {

    public static int fibonacci(int n,int[] dp) {
        if (n<=1) return n;

        if(dp[n]!=-1)return dp[n];
        dp[n]= fibonacci(n - 1,dp) + fibonacci(n - 2,dp);
        return dp[n];

    }

    public static void main(String[] args) {
        int n =8;
        int[] dp = new int[n+1];

        for (int i = 0; i <=n; i++) {
            dp[i]=-1;
        }
            int res= fibonacci(n,dp);
            System.out.println(res);
    }
}

// package dp;

// public class fibo {

//     public int fibonacci(int n) {
//         if (n == 0) return 0;
//         if (n == 1) return 1;

//         return fibonacci(n - 1) + fibonacci(n - 2);
//     }

//     public static void main(String[] args) {
//         fibo obj = new fibo();
//         int n = 7;

//         for (int i = 0; i <=n; i++) {
//             System.out.print(obj.fibonacci(i) + " ");
//         }
//     }
// }





// package dp;
// public class fibo{
//     public int fibonacci(int n){
//         if(n==0)return 0;
//         if(n==1)return 1;

//         return fibonacci(n-1)+fibonacci(n-2);

//     }
//     public static void main(String[] args) {
//         fibo obj = new fibo();
//         int n = obj.fibonacci(7);
//         System.out.println(n);

//     }
// }