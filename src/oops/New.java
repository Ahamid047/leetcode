package oops;

public class New {
    public static void main(String[] args) {
        int [] arr ={1,2,5,3};
        int  sum=0;
        int min=arr[0];
        int n = arr.length+1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<min){
                min =arr[i+1];
            }
            sum+=arr[i];

        }
         int res = n/2*(2*min+(n-1)*1)-sum;
        System.out.println(res);

    }
    
}

