import java.util.stream.Stream;

public class Program32 {
    public static void main(String[] args) {
        Stream<Integer> cartStream = Stream.of(110, 145, 180, 174, 192, 180);
        Stream<Double> kgs = cartStream.map(item -> item * 0.456);
        kgs.forEach(item -> System.out.println(item));
    }
}
