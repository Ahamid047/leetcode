import java.util.*;

public class amcat{
    public static void main(String[] args) {
        int[] arr= {3,4,5,4,6,86,23,566,87,54,23,569,876,4543,4332,565,544323,544546};
        Arrays.sort(arr);
        int start =20;
        int end = 20000;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>start & arr[i]<end){
                System.out.print(arr[i]+" ");
            }

        }

    }
}