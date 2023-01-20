import java.util.Scanner;
import java.text.DecimalFormat;

public class Program38 {
    public static double Average(int grades[], int max) {
        int sum = 0;
        double average = 0.0;

        for (int i = 1; i < max; i++) {
            sum += grades[i];
            average = (double) sum / (double) i;
        }
        return average;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int i, grades[];
            grades = new int[20];
            DecimalFormat num = new DecimalFormat(".00");
            for (i = 0; i < 20; i++) {
                System.out.printf("Enter Grade: ");
                grades[i] = sc.nextInt();
                if (grades[i] == -1)
                    break;
            }
            System.out.println(num.format(Average(grades, i - 1)));
        }
    }
}
