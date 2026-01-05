
import java.util.ArrayList;

public class parenthesis {
    public static void main(String[] args) {
        int n =3;
        ArrayList<String> list = new ArrayList<>(n*2-1);
        
        for(int i =0;i<n;i++){
            list.add("(");
            list.add(")");

        }
        System.out.println(list);

        
    }
}
//n=4
// ["(((())))","((()))()","(())(())","()((()))","()()()()","(()()())","(()())()","()(()())","()(())()",""]
// Input: n = 3
// Output: ["((()))","(()())","(())()","()(())","()()()"]
// Example 2:

// Input: n = 1
// Output: ["()"]