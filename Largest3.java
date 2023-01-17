
public class Largest3 {
    static void print3largest(int arr[], int arr_size) {
        int i, first, second, third;
        if (arr_size < 3) {
            System.out.print(" Invalid Input ");
            return;
        }
        third = first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third)
                third = arr[i];
        }
        System.out.println(third);
    }

    public static void main(String[] args) {

        int arr[] = { 12, 54, 78, 25, 98 };
        int n = arr.length;
        print3largest(arr, n);
    }
}
