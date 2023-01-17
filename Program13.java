import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        // linked list implementation
        // linked list imlemts collection interface
        // lined list usues doubly linked list internally to store data
        // it allows duplicate elements
        // it is an ordered collection
        // linked list has a faster performnve when mainpulating elements
        // using linked list to suitable employee
        LinkedList<String> metaEmployees = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Registering employee No 000" + i);
            String newEmployee = sc.next();
            metaEmployees.add(newEmployee);
        }
        // we will use iterator to access element
        // iterator is like a pointer that helps us fetch elements.
        Iterator<String> pointer = metaEmployees.iterator();
        while (pointer.hasNext()) {
            System.out.println(pointer.next());
            sc.close();
        }
    }
}
