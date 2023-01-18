import java.util.stream.Stream;
import java.util.Arrays;

public class Progarm29 {
    public static void main(String[] args) {
        // accessing stream data using ForEach loop
        String[] cart = new String[] { "iPhone", "harmonKardon", "aura", "JBL", "Sony" };
        Stream<String> cartStream = Arrays.stream(cart);
        cartStream.forEach(anything -> System.out.println(anything));
        // filtering
        Stream<Integer> luckyNumbers = Stream.of(5, 4, 8, 6, 9, 2, 3, 1);
        luckyNumbers.forEach(num -> System.out.println(num));
        Stream<Integer> luckyNumbers1 = Stream.of(5, 4, 8, 6, 9, 2, 3, 1);
        System.out.println("Printing Even Numbers ONLY....");
        // fetch only even numbers.
        Stream<Integer> evenNumbers = luckyNumbers1.filter(num -> num % 2 == 0);
        evenNumbers.forEach(e -> System.out.println(e));

    }
}
