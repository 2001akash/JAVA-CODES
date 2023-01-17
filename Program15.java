import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Program15 {
    public static void main(String[] args) {
        Vector<Integer> customerBalance = new Vector<Integer>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 3; i++) {
            System.out.println("Hi!Add a new balnace?? ");
            customerBalance.add(sc.nextInt());
        }
        Iterator<Integer> balanceFetcher = customerBalance.iterator();
        while (balanceFetcher.hasNext()) {
            System.out.println("Your Account was updated with" + balanceFetcher.next());
        }
        System.out.println("Total Txans" + customerBalance.size());
        sc.close();
    }
}
