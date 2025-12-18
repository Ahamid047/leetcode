public class palindrome {
    public static void main(String[] args) {
        String s = "MADAM";

        boolean res=(fxn(s,0));
        System.out.println(res);
        
    }
    public static boolean fxn(String s, int i){
        int n = s.length();

        if(i>=n/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(n-i-1)){
            return false;
        }

        return fxn(s,i+1);
    }
}
