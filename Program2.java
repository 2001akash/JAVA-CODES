
//DAY-3 PEP-JAVA
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // let us create an array
        String[] grocery = new String[5];// <-A string array of length 5
        // below is the assingment of avlues to the array using indexes.
        grocery[0] = "milk";
        grocery[1] = "bread";
        grocery[2] = "butter";
        grocery[3] = "rusk";
        grocery[4] = "eggs";
        System.out.println(String.format("There are Total %d Items in CART", grocery.length));
        // length is an array property which returns count of elements.
        // using for loop to access all array elements.
        // Note:use counter in for as Array Index.
        for (int index = 0; index < grocery.length; index++) {
            System.out.println("Product No " + (index + 1) + ":" + grocery[index]);
            sc.close();
        }
    }
}
