
import java.util.Arrays;
import java.util.Scanner;

public class minimumDifference {
    private static int mindiff(int[] arr, int k){
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0;i+k-1<arr.length;i++){
            min= Math.min(min,arr[i+k-1]- arr[i]);
            
        }
        return min;
        
    }
        

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        System.out.println("Enter the elemnts of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int res = mindiff(arr,k);
        System.out.println(res);

        

    }
}
