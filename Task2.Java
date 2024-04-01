import java.util.Arrays;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        System.out.print("numRows: ");
        int numRows = new Scanner(System.in).nextInt();
        int[][] object = new int[numRows][];
        for (int i = 0; i < numRows; i++) {
            object[i] = new int[i+1];
            for (int j = 0; j <= i; j++) {
                if (j != 0 && j != i) {
                    object[i][j] = object[i-1][j-1] + object[i-1][j];
                }
                else
                    object[i][j] = 1;
            }
        }
        System.out.println(Arrays.deepToString(object));
    }
}
