
public class Rhombus {
    public static void main(String[] args) {
        int n =5;
        int num =0;
        for(int i=1;i<=n;i++){
            num++;
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k =1;k<=i;k++){
                
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}

// public class Rhombus {
//     public static void main(String[] args) {
//         int n =5;
//         for (int i = 1; i <= n; i++) {
//             for(int j =0;j<n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=0; j<n;j++){
//                 System.out.print("*");
//             }
//             System.out.println("");

            
//         }
//     }
// }
