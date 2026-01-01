public class prefixarraysum {
    public static void main(String[] args) {
        int[] arr ={3,2,4,5};
        int [] arr1 = new int[arr.length];
        arr1[0]= arr[0];
        for(int i =1;i<arr.length;i++){
            arr1[i]=arr[i]+arr1[i-1];
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
            
        }


    }
}