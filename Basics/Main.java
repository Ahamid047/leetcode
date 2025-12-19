public class Main {
    static int countPartitions(int[] nums) {
        int tsum = 0;
        for(int i=0;i<nums.length;i++){
            tsum +=nums[i];
        }

        System.out.println(tsum);

        int[] arr = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            if(i==0) 
                return arr[0]=nums[0];
            
            arr[i]=nums[i]+nums[i-1];
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {10,10,3,7,6};
        System.out.println(countPartitions(nums));
    }
}
