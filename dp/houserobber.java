package dp;

public class houserobber {
    public static int maxloot(int[]arr, int i){
        if(i>=arr.length)return 0;
        int steal = arr[i]+maxloot(arr, i+2);
        int skip = maxloot(arr,i+1);
        return Math.max(skip,steal);


    }
    public static void main(String[] args) {
        int[] arr ={6, 7, 1, 3, 8, 2, 4};
        int res= maxloot(arr,0);
        System.out.println(res);
        
    }
}
