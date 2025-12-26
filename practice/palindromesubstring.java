public class palindromesubstring {
    static boolean  fxn(int i, int j ,String s){
        if(i>=j) return true;
        if(s.charAt(i) == s.charAt(j)) return fxn(i+1,j-1,s);
        return false;
    }
    public static void main(String[] args) {
        String s ="aabbcc";
        int n = s.length();
        int count =0;
        for(int i =0;i<n;i++){
            for(int j=i;j<n;j++){
                if(fxn(i,j,s)){
                    count++;
                }
            }
        }
        System.out.println(count);
        
    }
    
    
}
