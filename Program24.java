import java.util.ArrayList;

public class Program24 {
    public static void main(String[] args) {
        ArrayList<String> lr = new ArrayList<String>();
        lr.add("Red");
        lr.add("Green");
        lr.add("Orange");
        lr.add("White");
        lr.add("Black");
        ArrayList<String> lr1 = new ArrayList<String>();
        lr.add("Akash");
        lr.add("shruti");
        lr.add("Bittu");
        ArrayList<String> a = new ArrayList<String>();
        a.addAll(lr);
        a.addAll(lr1);// lr1.addAll(lr2); Or method to add
        System.out.println("New arary after sum: " + a);
    }
}
