
//import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class Program20 {
    public static void main(String[] args) {
        // ThE MAP interface (key:value)
        // a map contains the data as a key/value pair
        // Map,String
        TreeMap<String, String> states = new TreeMap<String, String>();
        states.put("ALL", "Alabama");
        System.out.println(states);
        states.put("ARL", "Alabama");
        states.put("CA", "Arkansaa");
        states.put("NY", "NewYork");
        states.put("TX", "Texas");
        for (Map.Entry<String, String> pair : states.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
