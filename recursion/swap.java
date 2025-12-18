
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        swap(arr, 0,n-1);
        for (int i = 0; i < n; i++) {
             System.out.print(arr[i]+" ");
            
        }

        

    }
    public static void swap(int []arr, int left, int right){
        if(left >= right){
            return;
        }
        int temp = arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

        swap(arr, left+1,right-1);



    }
}
