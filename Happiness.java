
import java.util.Scanner;

//import java.util.Arrays;
public class Happiness {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = "akash deep";
        int sum = 0;
        for (int i = 0; i < name.length(); i++) {
            sum += name.charAt(i);
        }
        System.out.println(sum);
        sc.close();
    }
} // or approach
/*
 * String name = "akash deep";
 * int score=0;
 * for(char n:name.toCharArrya()){
 * System.out.println("Happiness score:"+score);
 * }
 * }
 */
