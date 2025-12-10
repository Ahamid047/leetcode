public class pattern2 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if(i>j){
                    System.out.print(" ");
                }else{
                    System.out.print("* ");
                }

            }
            System.out.println(" ");
        }
    }

}


// * * * * *  
// * * * *
// * * *
// * *
// *
// public class pattern2 {

//     public static void main(String[] args) {

//         for (int i = 1; i <= 5; i++) {
//             for (int j = 5; j >= i; j--) {
//                 System.out.print("* ");

//             }
//             System.out.println(" ");
//         }
//     }

// }

// import java.util.Scanner;

// public class pattern2 {
//     static void pattern(int n){
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1 ; j<=i ; j++) {
//                 System.out.print("* ");
                
//             }
//             System.out.println("");
//         }
//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         pattern(n);

        
//     }
// }





// ****
// ****
// ****
// ****
// public class pattern2 {
    
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1 ; j<=4 ; j++) {
//                 System.out.print("*");
                
//             }
//             System.out.println("");
//         }
//     }
// }


// *
// * *
// * * *
// * * * *
// public class pattern2 {
    
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1 ; j<=i ; j++) {
//                 System.out.print("*");
                
//             }
//             System.out.println("");
//         }
//     }
// }
