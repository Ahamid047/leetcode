
import java.util.Scanner;

// Take an array of numbers as input and check if it is an array sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//        {3, 4, 6, 2} is not sorted in ascending order.

public class ArrayExample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of our array");
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        boolean isAscending = true;

        for(int i =0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                isAscending = false;
            }

        }
        if(isAscending){
            System.out.println("in ascending ");
        }else{
            System.out.println("not ascending ");
        }
    }
}

// public class ArrayExample {
//     public static void main(String[] args) {
//         int arr[] = {6,7,4,0,5};
//         int min = Integer.MAX_VALUE;
//         int max = Integer.MIN_VALUE;

//         for (int i = 0; i < arr.length; i++) {
//             if(min>arr[i]){
//             min =arr[i];
//         }   
//         if(arr[i]<max){
//             max = arr[i];
//         }
//         }
//         System.out.println(min);
//         System.out.println(max);

//     }
// }

// import java.util.Arrays;

// public class ArrayExample {
//     public static void main(String[] args) {
//         int arr[] = {6,7,4,0,5};
//         int index= Arrays.binarySearch(arr, 4);
//         System.out.println(index);
//     }
// }
