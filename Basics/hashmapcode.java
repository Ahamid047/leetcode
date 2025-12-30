
import java.util.HashMap;
import java.util.Map;

public class hashmapcode {
    public static void main(String[] args) {
        
        HashMap<Integer, String> map = new HashMap<>();
        
        map.put(1, "Abdul");
        map.put(2, "Hamid");

        // Iterate 
        for (Map.Entry<Integer, String> entry : map.entrySet()) {

            Integer key = entry.getKey();
            String value = entry.getValue();
            
            System.out.println("Key: " + key + ", Value: " + value);
        }

        //use of keySet():- to get the all  the key value from the hashset
    }
}
