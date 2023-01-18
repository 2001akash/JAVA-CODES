import java.util.stream.Stream;

///import java.util.Arrays;
public class Program30 {
    public static void main(String[] args) {

        Stream<String> vowelNames = Stream.of("Akash", "Eshwar", "Ishani", "Bittu", "Utkarsh");
        vowelNames.forEach(num -> System.out.println(num));
        Stream<String> vowelNames1 = Stream.of("Akash", "Eshwar", "Ishani", "Bittu", "Utkarsh");
        System.out.println("Printing names with vowels ONLY....");
        // fetch only name with starting with vowels.
        // filtering
        Stream<String> vowelNames2 = vowelNames1.filter(n -> n.charAt(0) == 'A' || n.charAt(0) == 'E'
                || n.charAt(0) == 'I' || n.charAt(0) == 'O' || n.charAt(0) == 'U');
        vowelNames2.forEach(n -> System.out.println(n));
    }
}
