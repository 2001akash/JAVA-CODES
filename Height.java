
public class Height {
    public static void main(String[] args) {
        int arr[] = new int[] { 3, 6, 1, 7, 7 };
        int max = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = Math.max(arr[i], max);
            }
        }
        System.out.println(max);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                count++;
            }
        }
        System.out.println("Total tallest candles are " + count);
    }
}
// 0R APPROACH

/*
 * import java.util.Arrays;
 * 
 * import java.util.Scanner;
 * 
 * public class program3 {
 * 
 * public static void main(String[] args) {
 * 
 * // Write a Java program that takes height of 5 candles.
 * 
 * //
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * int[] candles = new int[5];
 * 
 * int cnt=0;
 * 
 * for(int i=0; i<candles.length;i++) {
 * 
 * candles[i] = sc.nextInt();
 * 
 * }
 * 
 * Arrays.sort(candles);
 * 
 * for(int index:candles) {
 * 
 * if(index==candles[candles.length-1]) {
 * 
 * cnt++;
 * 
 * }
 * 
 * }
 * 
 * System.out.println(cnt);
 * 
 * }
 * 
 * }
 */
