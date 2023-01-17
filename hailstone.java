//by akash deep 12006825
public class hailstone {
    public static int c;

    public static int HailstoneNumbers(int n) {
        System.out.print(n + " ");

        if (n == 1 && c == 0) {

            return c;
        } else if (n == 1 && c != 0) {

            c++;
            return c;
        } else if (n % 2 == 0) {

            c++;
            HailstoneNumbers(n / 2);
        } else if (n % 2 != 0) {

            c++;
            HailstoneNumbers(3 * n + 1);
        }
        return c;
    }

    public static void main(String[] args) {
        int n = 10;
        int x;
        x = HailstoneNumbers(n);
        System.out.println();
        System.out.println("Number of Steps: " + x);
    }
}

// 0R CHECK ONCE

/*
 * import java.util.*;
 * public class Main {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * System.out.println(n);
 * System.out.println("Output Hailstone is as follows");
 * while(n!=1)
 * {
 * System.out.println(n);
 * if(n%2!=0){
 * n=n*3 +1;
 * }
 * else
 * {
 * n=n/2;
 * }
 * }
 * }
 * }
 */
