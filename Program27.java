import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class Program27 {
    public static void main(String[] args) {
        // java straem API
        // stream refers to the set of built in fns that lets us process data quickly
        // and faster
        // Priamrily known as functional programming.
        // Stream API let us write codes that are short/simple/faster/elegant
        // let us learn how can we create streams &work with streams
        // here is an example that craetes and empty stream

        // Stream<String> emptyStream = Stream.empty();//dont comment it
        // other method of creating straem.
        // we can create stream from arrays
        Collection<String> courses = Arrays.asList("Java", "PHP", "Dotnet", "C#", "JQUERY");
        Stream<String> courseStream = courses.stream();
        System.out.println(courseStream);
    }
}