
import java.util.HashMap;

public class hashmapp {
    public static void main(String[] args) {
        HashMap <Integer, String> map =new HashMap<>();
        map.put(1,"Abdul");
        map.put(2,"hamid01");
        
        // System.out.println(map);
        map.put(2,"hamid1");
        System.out.println(map); // printed the last updated value


        map.remove(1);
        if(map.containsKey(1)){
            System.out.println("present ");

        }else{
            System.out.println("not present");
        }

        
    }
}
