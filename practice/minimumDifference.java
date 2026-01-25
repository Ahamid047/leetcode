
import java.util.Scanner;

public class minimumDifference {
    private static int mindiff(int[] arr, int k){
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                if(arr[i]-arr[j]<min){
                    min = Math.abs(arr[i]-arr[j]);
                
                }
            }
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
        for (int j = 0; j < n; j++) {

            System.out.print(arr[j]+" ");

        }

        

    }
}
