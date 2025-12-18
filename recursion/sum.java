
public class sum {
    public static void main(String[] args) {
        fac(20,1);
        
    }
    public static void fac(int n, long f){
        if(n<=1){
            System.out.println(f);
            return;
        }
        fac(n-1,f*n);


    }
}
