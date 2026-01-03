package dp;
public class fibo{
    public int fibonacci(int n){
        if(n==0)return 0;
        if(n==1)return 1;

        return fibonacci(n-1)+fibonacci(n-2);

    }
    public static void main(String[] args) {
        fibo obj = new fibo();
        int n = obj.fibonacci(8);
        System.out.println(n);

    }
}