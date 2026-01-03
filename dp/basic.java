package dp;

public class basic {

    public int recursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * recursion(n - 1);
        
    }

    public static void main(String[] args) {
        basic obj = new basic();
        int res = obj.recursion(5);
        System.out.println(res);
    }
}
