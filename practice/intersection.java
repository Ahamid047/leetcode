
import java.util.HashSet;

public class intersection {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int count=0;
        
        int [] arr ={3,4,2,4,3};
        int [] arr2= {8,6,3,4,1,2};

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]); 
        }
        for(int j =0;j<arr2.length;j++){
            if(set.contains(arr2[j])){
                count++;
            }
        }
        System.out.println(count);
    }
}
