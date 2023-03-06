import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            double per = 0;
            int marks[] = new int[n];
            int sum = 0, high, low;
            System.out.println("Enter the marks of  students:");
            high = marks[0];
            low = marks[0];
            int i;
            for (i = 0; i < n; i++) {
                marks[i] = sc.nextInt();
            }
            for (i = 0; i < n; i++) {
                if (marks[i] > high) {
                    high = marks[i];
                }
                if (marks[i] < low) {
                    low = marks[i];
                }
                sum = sum + (marks[i]);
                per = (sum / n);
            }
            System.out.println("Total sum:" + sum);
            System.out.println("Lowest marks:" + low);
            System.out.println("Highest marks:" + high);
            System.out.println("Percentage=" + per);
            sc.close();
        }
    }
}
