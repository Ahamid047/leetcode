
import java.util.Scanner;

public class MultiplePattern {

    public static void main(String[] args) {
        MultiplePattern s = new MultiplePattern();
        // s.pattern1();
        // s.pattern2();
        // s.pattern3();
        // s.pattern4();
        // s.pattern5();
        // s.pattern6();
        // s.pattern7();
        // s.pattern8();
        // s.pattern9();
        // s.pattern10();
        s.pattern11();


    }

    public void pattern1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void pattern2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");

        }

    }

    public void pattern3() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }
        System.out.println(" ");

    }

    public void pattern4() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");

            }
            System.out.println(" ");
        }
        System.out.println(" ");

    }

    public void pattern5() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

    }

    public void pattern6() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }

    }

    public void pattern7() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }

    }

    public void pattern8() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println("");
        }

    }

    public void pattern9() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j)%2==0){
                    System.out.print("1");

                }else{
                    System.out.print("0");
                }
            }
            System.out.println("");
        }

    }


    public void pattern10(){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j || i+j ==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
            
        }
    }
    public void pattern11(){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        // for(int i=n;i>=1;i--){
        //     for(int j=0;j<=n*2-1;j++){
        //         if (j <= k || j>=n-k) {
        //             System.out.print(" ");
        //         }else {
        //             System.out.print("*");

        //         }
        //     }
        //     k++;
        //     System.out.println("");
        // }

        for (int i=n;i>0;i--) {
            for (int k=1; k<=n-i; k++) {
                System.out.print(" ");
            }
            for (int j=(i*2-1); j>0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}