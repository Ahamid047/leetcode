
package dp;

public class fibo {

    public int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        fibo obj = new fibo();
        int n = 7;

        for (int i = 0; i < n; i++) {
            System.out.print(obj.fibonacci(i) + " ");
        }
    }
}





// package dp;
// public class fibo{
//     public int fibonacci(int n){
//         if(n==0)return 0;
//         if(n==1)return 1;

//         return fibonacci(n-1)+fibonacci(n-2);

//     }
//     public static void main(String[] args) {
//         fibo obj = new fibo();
//         int n = obj.fibonacci(6);
//         System.out.println(n);

//     }
// }