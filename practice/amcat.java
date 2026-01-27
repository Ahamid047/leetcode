import java.util.*;

public class amcat{
    public static void main(String[] args) {
        int[] arr= {-10,5,8,-3,2,0};
        Arrays.sort(arr);
        int start =-5;
        int end = 5;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>=start && arr[i]<=end){
                System.out.print(arr[i]+" ");
            }

        }

    }
}