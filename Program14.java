import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.Scanner;

public class Program14 {

    public static void main(String[] args) throws IOException {

        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        ArrayList<String> name = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            System.out.println("sci number " + i);
            String newName = br.readLine();
            name.add(newName);
        }
        for (String fullName : name) {
            // first split the fullName into 2 Parts
            String[] nameArray = fullName.split(" ");
            // take the last name (keep in mind the fullname may have first middle last
            // name)
            String lastName = nameArray[nameArray.length - 1];
            char initial = fullName.charAt(0);
            String invite = String.format("Dear Mr. %s.%s", lastName, initial);
            System.out.println(invite);
        }
    }
}
// OR APPROACH
/*
 * Iterator<String> pointer = name.iterator();
 * 
 * while (pointer.hasNext()) {
 * 
 * System.out.println("Dear Mr. " +pointer.next());
 * sc.close();
 * }
 * }
 * }
 */
