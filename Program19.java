import java.util.HashMap;
import java.util.Map;

public class Program19 {
    public static void main(String[] args) {
        Map<String, String> states = new HashMap<String, String>();
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
