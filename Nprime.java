import java.util.Scanner;

public class Nprime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        int[] arr = new int[num];
        int sum = 0;
        int flag = 0;
        for (int i = 0; i < num; i++) {
            arr[i] = 0;
        }
        for (int i = 2; i <= num; i++) {
            if (arr[i] == 0) {
                for (int j = i; j < num; j += i) {
                    arr[j] = 1;
                }
                // cout<<i<<" "; //this is for printing prime numbers
                if (flag % n == 0) {
                    sum += i;
                }
                flag++;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
