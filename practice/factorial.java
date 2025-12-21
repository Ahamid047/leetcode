
import java.util.Scanner;

public class factorial {
    public static int  fxn(int i){
        int ans =1;
        if(i ==0 || i==1){
            return 1;
        }
        return i *fxn(i-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        

        System.out.println(fxn(5));
        
    }
}
