import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverse = 0;
        int n = number;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        if (reverse == n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }

}
