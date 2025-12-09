
import java.util.Scanner;

public class Mixpattern {

    public static void main(String[] args) {
        System.out.println("Enter L for left Pyramid");
        System.out.println("Enter R for left Pyramid");
        System.out.println("Enter C for left Pyramid");
        Scanner Choice = new Scanner(System.in);
        String s = Choice.nextLine();

        if (s.equals("L")) {
            leftPyramid();
        } else if (s.equals("C")) {
            centerPyramid();
        } else if (s.equals("R")) {
            rightPyramid();

        } else {
            System.out.println("Invalid Choice");
        }

    }

    static void leftPyramid() {
        System.out.println("Please Enter the height of the pyramid");
        Scanner numrows = new Scanner(System.in);
        int n = numrows.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void rightPyramid() {
        System.out.println("Enter the height of the pyramid");
        Scanner newrows = new Scanner(System.in);
        int n = newrows.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void centerPyramid() {
        System.out.println("Enter the height of the pyramid");
        Scanner newrows = new Scanner(System.in);
        int n = newrows.nextInt();
        System.out.println("");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (i > j) {
                    System.out.print(" ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println("");

        }

    }

}
