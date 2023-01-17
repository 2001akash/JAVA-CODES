import java.util.Scanner;

public class Chocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rupees:");
        int rupees = sc.nextInt();
        System.out.println("Enter the price:");
        int price = sc.nextInt();
        int choco = rupees / price;
        int eaten = choco;
        int wrapper = choco;
        while (wrapper >= 3) {
            int n = wrapper / 3;
            wrapper -= 2 * n;
            eaten += n;
        }
        sc.close();
        System.out.println(eaten);
    }
}