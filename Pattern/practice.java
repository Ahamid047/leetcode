
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            for(int j = n-1;j>i;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=0;j--){
                System.out.print(j+1);
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+1);
            }
            System.out.println();
        }

        
     
    }
}

//     1 
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5


        // int num =0;
        // for(int i=1;i<=n;i++){
        //     num++;
        //     for(int j=n;j>i;j--){
        //         System.out.print(" ");
        //     }
        //     for(int k =1;k<=i;k++){
                
        //         System.out.print(num+" ");
        //     }
        //     System.out.println();
        // }
//     *****
//    *****
//   *****
//  *****
// *****

// for(int i=0;i<n;i++){
//             for(int j=n-1;j>i;j--){
//                 System.out.print(" ");
//             }
//             for(int k =1;k<=n;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

// 1
// 01
// 101
// 0101
// 10101

// for(int i =1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 if((i+j)%2==0){
//                     System.out.print("1");

//                 }else{
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }


// 1
// 23
// 456
// 78910
        // int num =1;
        // for(int i =1;i<n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(num);
        //         num++;
        //     }
        //     System.out.println();
        // }

// 12345
// 1234
// 123
// 12
// 1

// for(int i=n;i>0;i--){
//             for(int j=1;j<i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();

//         }




//1
//12
//123
//1234

// for(int i =1;i<n;i++){
//             for(int j =1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }


//     *
//    **
//   ***
//  ****

// for(int i =0;i<n;i++){
//             for(int j=n;j>i;j--){
//                 System.out.print(" ");
//             }
//             for(int k=0;k<=i;k++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
        

//reverse inverted triangle
// for (int i = 0; i < n; i++) {
//             for(int j=n;j>i;j--){
//                 System.out.print("*");
//             }

//             System.out.println();
            
//         }

// Hollow rectangle
// for(int i=0;i<n;i++){
//             for(int j =0;j<n;j++){
//                 if(i==n-1 || j==n-1 || i==0||j==0){
//                     System.out.print("*");

//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }