package practice;

import java.util.Scanner;

class smallercount
{
    public int countSmallerLefts(int len, int[] arr)
    {
        int i,count = 0;
        for(i = 0 ; i < len-1 ; i++)
        {
           if(arr[i] < arr[i+1])
              count++;
        }
        return count;
    }
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int [] arr = new int[len];
        for(int i =0;i<len;i++){
            arr[i]= sc.nextInt();
        }
        int res = countSmallerLefts(len,arr);
        System.out.println(res);
        
    }
}