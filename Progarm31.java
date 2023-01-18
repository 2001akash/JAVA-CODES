import java.util.stream.Stream;
import java.util.Arrays;

public class Progarm31 {
    public static void main(String[] args) {
        String[] cart = new String[] { "iPhone", "harmonKardon", "aura", "JBL", "Sony" };
        Stream<String> cartStream = Arrays.stream(cart);
        Stream<String> upperCaseProducts = cartStream.map(item -> item.toUpperCase());
        upperCaseProducts.forEach(item -> System.out.println(item));
    }
}
