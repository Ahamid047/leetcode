// *
// **
// ***
// ****
// *****

//     *
//    **
//   ***
//  ****
// ***** 
// public class pattern{
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <=i ; j++) {
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }
public class pattern {

    public static void main(String[] args) {
        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");

        //     }
        //     System.out.println(" ");
        // }
        for (int k = 5; k >=0; k--) {
            for (int j = 0; j < 5; j++) {
                if(j<k){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }


                System.out.println("  ");
            }
        // for (int i = 1; i <= 5; i++) {
            

        //     for (int j = 1; j <= i; j++) {

        //         System.out.print("*");

        //     }
        //     System.out.println("");

        // }
    }
}
