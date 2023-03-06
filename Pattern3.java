import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sumStar = 0;
        int sumHash = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                sumStar++;
            } else if (str.charAt(i) == '#') {
                sumHash++;
            }
        }
        System.out.println(sumHash - sumStar);
        sc.close();
    }
}
