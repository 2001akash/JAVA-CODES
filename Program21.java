import java.util.LinkedHashMap;

//import java.util.HashMap;
public class Program21 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
        String prescrition = "Sun Kiwi,Mon Apple ,Tue Guava,Wed Grapes,Thu Mango";
        String[] pArr = prescrition.split(" ");
        for (String data : pArr) {
            String[] arr = data.split(" ");
            map.put(arr[0], arr[1]);
        }
        System.out.println(map);
    }
}
