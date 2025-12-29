
import java.util.Arrays;

public class runnignsumarray {
    public static void main(String[] args) {
        int arr[]={3,4,5,6};
        int [] nums=new int[arr.length];

        nums[0] =arr[0];

        for(int i =1;i<arr.length;i++){
                nums[i]= arr[i]+nums[i-1];
        }
        System.out.println(Arrays.toString(nums));
    }
}
