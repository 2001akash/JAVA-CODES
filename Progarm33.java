
//import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.Collections;
import java.util.IntSummaryStatistics;

public class Progarm33 {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
        long count = strList.stream().filter(x -> x.isEmpty()).count();
        System.out.println(count);
        long num = strList.stream().filter(x -> x.length() > 3).count();
        System.out.println(num);
        long start = strList.stream().filter(x -> x.startsWith("a")).count();
        System.out.println(start);
        List<String> filtered = strList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany",
                "Italy", "U.K.", "Canada");
        String G7Countries = G7.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.joining("- "));
        System.out.println(G7Countries);
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> distinct = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.printf("Original List : %s, Square Without duplicates : %s %n", numbers, distinct);
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Highest prime number in List : " + stats.getMax());
        System.out.println("Lowest prime number in List : " + stats.getMin());
        System.out.println("Sum of all prime numbers : " + stats.getSum());
        System.out.println("Average of all prime numbers : " + stats.getAverage());
    }

}
