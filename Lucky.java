import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the four digit number:");
        int n = sc.nextInt();
        int num = n;
        while (num != 0) {
            num = num / 10;
            count = count + 1;
        }
        if (count == 4) {
            if (n % 3 == 0 || n % 5 == 0 || n % 7 == 0) {
                System.out.println("Lucky Number");
            }
        } else {
            System.out.println("Invalid Number");

        }
        sc.close();
    }
}
