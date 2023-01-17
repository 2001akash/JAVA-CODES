import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class Program26 {
    public static void main(String[] args) {
        HashSet<String> hr = new HashSet<String>();
        hr.add("Red");
        hr.add("Green");
        hr.add("Orange");
        hr.add("White");
        hr.add("Black");
        System.out.println("Original HashSet" + hr);
        Set<String> ts = new TreeSet<String>(hr);
        System.out.println("TreeSet elements: ");
        for (String element : ts) {
            System.out.println(element);
        }
    }
}
