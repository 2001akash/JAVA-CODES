
import java.util.LinkedList;

public class Program25 {
    public static void main(String[] args) {
        LinkedList<String> lr = new LinkedList<String>();
        lr.add("Red");
        lr.add("Green");
        lr.add("Orange");
        lr.add("White");
        lr.add("Black");
        System.out.println("Original linked list " + lr);
        String x = lr.peekFirst();
        System.out.println("First element in the list: " + x);
        System.out.println("Original linked list: " + lr);
    }
}
