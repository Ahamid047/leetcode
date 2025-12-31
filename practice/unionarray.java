
import java.util.HashSet;

public class unionarray {
    public static void main(String[] args) {
        int[] arr ={1};
        int[] arr2={2};

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
         for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        System.out.println(set.size());
    }
}
