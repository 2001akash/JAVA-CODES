public class Largest2 {
    public static void main(String args[]) {
        System.out.println(secondMax(new int[] { 45, 103, 67, 23, 89, 101 }));
    }

    static int secondMax(int[] arr) {
        int max = Math.max(arr[0], arr[1]);
        int secondMax = Math.min(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] < max)
                secondMax = arr[i];
        }
        return secondMax;
    }
}