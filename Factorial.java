import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int f = 1;
        for (int i = m; i <= n; i++) {
            f = f * i;
            // for (int j = 1; j <= i; j++) {

            // }
        }
        sc.close();
        System.out.println("Factorial of the no=" + f);
    }
}