
public class Program8 {
    public static void main(String[] args) {
        int[][] testArr = { { 10, 20, 30, 40, 50 }, { 70, 80, 90 }, { 100 }
        };
        // jagged array
        // using both:foreeach and nested loop print the avobe jagged array
        for (int row = 0; row < 3; row++)

        {
            for (int col = 0; col < testArr[row].length; col++) {
                System.out.print(testArr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
