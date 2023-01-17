import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        String[] Heroes = { "Akash", "Iron Man", "Bittu", "Shruti", "kriish" };
        for (String hero : Heroes) {
            System.out.println("I AM " + hero);
        }
        Scanner sc = new Scanner(System.in);
        int[] serialNos = new int[5];
        for (int i = 0; i < serialNos.length; i++) {
            System.out.println("Enter Serial No!");
            serialNos[i] = sc.nextInt();
            sc.close();
        }
    }
}
