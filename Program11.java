import java.util.ArrayList;

public class Program11 {
    public static void main(String[] args) {
        // arraylist
        // dyanmic ds:grow & shirnk the size of ds
        // ds-generic and non-generic
        ArrayList<Integer> grocery = new ArrayList<Integer>();
        grocery.add(12);
        grocery.add(10);
        grocery.add(124);
        // grocery.add(true);
        ArrayList<Integer> grocery1 = new ArrayList<Integer>();
        grocery1.add(10);
        grocery1.add(20);
        // grocery1.add("thirsty");
        // adavntage og generic data st is there is not typecasting in such collection.
        // which adds to performance enhancement of application
        // tpecasting slows down apps or affects performance of application.
    }
}
