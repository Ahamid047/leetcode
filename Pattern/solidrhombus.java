
import java.util.Scanner;

public class solidrhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        // for(int i =1;i<=n;i++){
        //     for(int j =1;j<=n;j++){
        //         System.out.print("*");
        //     }
        // }
        // System.out.println();
        
        
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < n - i - 1; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k = 0; k < n; k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        for(int i = 0; i < n; i++){ 
            for(int j = 0; j < n - i - 1; j++){
               System.out.print(" ");
            }
            for(int j = i; j >= 0; j--){
                System.out.print(j+1);
            }
            for(int k = 1; k <= i; k++){
                System.out.print(k+1);
            }
            System.out.println();
        }

        // for (int i = 2; i <= n ; i++) {
        //     for(int j =2;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
            
        // }
        
    }
}





//    *****
//   *****
//  *****
// *****