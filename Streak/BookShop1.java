
import java.util.Scanner;

public class BookShop1 {
    static int maxpages(int i, int budget, int [] h, int [] x , int n){
        if(i==n ||budget ==0)return 0;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [] h =new int[n];
        int [] x = new int[n];
         
        for(int i =0;i<n;i++){
            h[i]= sc.nextInt();
        }
        for(int i =0;i<n;i++){
            x[i]= sc.nextInt();
        }
        
    }
}
