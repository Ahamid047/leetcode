
import java.util.Scanner;

public class BookShop {

    static int maxPages(int i, int budget, int[] h, int[] s, int n) {
        if (i == n || budget == 0) return 0;

        int leave = maxPages(i + 1, budget, h, s, n);
        int take = 0;

        if (h[i] <= budget) {
            take = s[i] + maxPages(i + 1, budget - h[i], h, s, n);
        }


        return Math.max(leave, take);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        

        int[] h = new int[n];
        int[] s = new int[n];

        for (int i = 0; i < n; i++){
            h[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
             s[i] = sc.nextInt();
        }

        System.out.println(maxPages(0, x, h, s, n));
    }
}
