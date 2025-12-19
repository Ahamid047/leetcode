import java.util.Scanner;

public class FactoryProduction {

    public static boolean canProduceInTime(long time, int n, int t, int[] k) {
        long totalProducts = 0;
        for (int i = 0; i < n; i++) {
            totalProducts += time / k[i];
            if (totalProducts >= t) {
                return true;
            }
        }
        return totalProducts >= t;
    }

    public static long minimumTimeToProduce(int n, int t, int[] k) {
        long low = 1;
        long high = (long) Math.min(k[0], k[1]) * t;  

        for (int i = 2; i < n; i++) {
            high = Math.min(high, (long) k[i] * t);  
        }

        while (low < high) {
            long mid = (low + high) / 2;
            if (canProduceInTime(mid, n, t, k)) {
                high = mid;  
            } else {
                low = mid + 1;  
            }
        }

        return low;
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] k = new int[n];

        for (int i = 0; i < n; i++) {
            k[i] = scanner.nextInt();
        }

        
        long result = minimumTimeToProduce(n, t, k);
        System.out.println(result);

        scanner.close();
    }
}
