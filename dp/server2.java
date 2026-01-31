package dp;

import java.util.Scanner;

public class server2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("the number of server you want to allocate and take the server1 output from that");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum =0;
        for(int i =0;i<n;i++){
            if(arr[i]>0){
                sum+=arr[i];
            }

        }
        System.out.println(sum);

    }
}
