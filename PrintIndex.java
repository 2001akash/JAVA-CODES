import java.util.Scanner;

public class PrintIndex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean b = false;
        System.out.print("The element to be searched in the array: ");
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int j = i;
            if (arr[i] == m) {
                System.out.println("The index of element " + m + " is " + j);
                b = true;
                break;
            }
        }
        if (b == false) {
            System.out.println("-1 : The element " + m + " is not present in the array");
        }
        sc.close();
    }
}
