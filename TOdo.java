
//package Todo_Manager;
import java.util.ArrayList;
import java.util.Scanner;

public class TOdo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        int choice;
        int i = 0;

        do {
            // Display the Menu
            System.out.println("Please choose an option\n");
            System.out.println("1. Enter 1 to add todo ");
            System.out.println("2. Enter 2  to list all todo");
            System.out.println("3. Enter 3 to Select and view todo ");
            System.out.println("4. Enter 4 to delete todo");
            System.out.println("5. Enter 5 to update todo");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    i++;
                    System.out.println("Enter number of tasks: ");
                    String a = sc.next();
                    list.add(i + " ." + a);
                    break;
                case 2:
                    System.out.println(list.toString());
                    break;
                case 3:
                    System.out.println("Enter the todo to select and view");
                    int j = sc.nextInt();
                    System.out.println(list.get(j - 1));
                    break;
                case 4:
                    System.out.println("enter the todo to delete ");
                    int k = sc.nextInt();
                    list.remove(k - 1);
                    break;
                case 5:
                    System.out.println("enter the todo to update ");
                    int x = sc.nextInt();
                    System.out.println("enter the new todo");
                    String c = sc.next();
                    list.set(x - 1, c);
                    break;
            }
        } while (choice != 6);
        sc.close();
    }
}