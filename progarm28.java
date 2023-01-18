import java.util.stream.Stream;
import java.util.Arrays;

public class progarm28 {
    public static void main(String[] args) {
        // others method of creating strams in java

        Stream<String> colors = Stream.of("Red", "Green", "Aura", "JBL", "Sony");

        // creating stream from existing array

        String[] cart = new String[] { "iPhone", "harmonKardon", "aura", "JBL", "Sony" };

        Stream<String> cartStream = Arrays.stream(cart);

        // using StreamBuider to create stream

        Stream<String> beverages = Stream.<String>builder().add("Tea").add("Tea").add("Juice").build();

        // Stream.Generate()

        Stream<String> emojis = Stream.generate(() -> "❤️").limit(10);

        // in the avove code the generate(0generates the given string i.e emoji 10
        // times)
        emojis.forEach(i -> System.out.println(i));
    }
}
