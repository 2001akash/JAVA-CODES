public class Program7 {
    public static void main(String[] args) {
        int arr1[][] = { { 1, 2 }, { 3, 4 } };
        int arr2[][] = { { 5, 6 }, { 7, 8 } };
        int productArr[][] = new int[2][2];
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                productArr[i][j] = arr1[i][j] * arr2[i][j];
                System.out.println(productArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
 * for(int[] subArr:productarr){
 * for(int element:subArr){
 * System.out.print(element+"\t");
 * }
 * System.out.println();
 * }
 * }
 * }
 */
