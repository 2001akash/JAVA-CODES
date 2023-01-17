import java.util.ArrayList;
import java.util.Collections;

public class Program23 {
    public static void main(String[] args) {
        ArrayList<String> lr = new ArrayList<String>();
        lr.add("Red");
        lr.add("Green");
        lr.add("Orange");
        lr.add("White");
        lr.add("Black");
        System.out.println("list before reversing " + lr);
        Collections.reverse(lr);
        System.out.println("list after reversing " + lr);
    }

}
