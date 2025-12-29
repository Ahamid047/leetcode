import java.util.HashMap;

public class hashmap1 {
    public static void main(String[] args) {
        HashMap<String, String> map= new HashMap<>();
        map.put("@","Abdul");
        
        System.out.println(map);
        // boolean n = map.containsKey("@");
        String n =map.get("@");
        System.out.println(n);


    }
}
