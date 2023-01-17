
//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Program17 {
    public static void main(String[] args) throws IOException {
        // Prioity Queue
        PriorityQueue<String> customerComplaints = new PriorityQueue<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i <= 4; i++) {
            System.out.println("Type your compalints!!!");
            String text = br.readLine();
            customerComplaints.add(text);
        }
        System.out.println("First complaint registered was " + customerComplaints.element());
        System.out.println("First complaint again " + customerComplaints.peek());

        System.out.println("De-register first complaint " + customerComplaints.remove());
        System.out.println("Total complaints we are left with " + customerComplaints.size());
        while (customerComplaints.size() > 0) {
            System.out.println("Closing Complaints ,Curents is -" + customerComplaints.poll());
        }
        System.out.println("Total complaint count " + customerComplaints.size());
    }
}
