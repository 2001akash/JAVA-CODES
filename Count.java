import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while (num != 0) {
            num /= 10;
            ++count;
        }
        sc.close();
        System.out.println("Number of digits: " + count);
    }
}
