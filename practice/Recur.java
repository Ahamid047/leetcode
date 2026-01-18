package practice;

public class Recur {
    public static void fxn(int i){
        if(i==0)return;
        System.out.println(i);
         fxn(i-1);
    }
    public static void main(String[] args) {
        int i =5;
        fxn(i);   
    }
}
