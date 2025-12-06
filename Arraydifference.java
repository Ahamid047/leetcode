public class Arraydifference {
    public static void main(String[] args) {
        int [] arr= {10,10,3,7,6};
        int runningsum=0;
        // int sum = 0;
        // for(int num:arr){
        //     sum += num;
        // }
        // System.out.println(sum);
        for(int i =0; i<arr.length;i++){
            
                System.out.println(arr[i]+arr[i-1]);
            }
        }
    }
}
