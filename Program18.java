import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Program18 {
    public static void main(String[] args) {
        // Set interface
        // set interface doesn't allow dupliactes
        // set interace represents unordered collectin of elemnts
        // set is implemnted using classes like HashSet,LinkedhashSet and TreeSet
        HashSet<String> products = new HashSet<String>();
        products.add("coffe");
        products.add("coffe");
        products.add("coffe");
        products.add("tea");
        System.out.println(products);
        // this class used linked list internally to store elemnts
        LinkedHashSet<String> products1 = new LinkedHashSet<String>();
        products1.add("coffe");
        products1.add("coffe");
        products1.add("coffe");
        products1.add("tea");
        System.out.println(products1);
        // treeset sorts the data in ascending order
        // treeset has better performance than previous two classes
        TreeSet<String> products2 = new TreeSet<String>();
        products2.add("coffe");
        products2.add("coffe");
        products2.add("coffe");
        products2.add("tea");
        System.out.println(products2);
    }
}
