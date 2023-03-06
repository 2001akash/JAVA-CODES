import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[4];
        for (int i = 0; i < 4; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            char ch = (char) num[i];
            System.out.println(num[i] + "-" + ch);
        }
        sc.close();
    }
}
