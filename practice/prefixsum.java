public class prefixsum {
    public static void main(String[] args) {
        int [] arr ={5,7,8,0,4};
        int [] arr2=new int[arr.length];

        arr2[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            arr2[i] = arr2[i - 1]+arr[i];
        }
        for (int x : arr2) {
            System.out.print(x + " ");
        }
    }
}