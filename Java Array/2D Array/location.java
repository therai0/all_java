
// Take the matrix as use input and find the x in matrix. Print the location of the x value:
import java.util.*;

public class location {
    public static void main(String argus[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows:");
            int row = sc.nextInt();
            System.out.println("Enter the number of colomns:");
            int colms = sc.nextInt();
            int arr[][] = new int[row][colms];

            // for user input:
            System.out.println("Enter the number for matrix:");
            for (int i = 0; i < row; i++) { // for row:
                for (int l = 0; l < colms; l++) {
                    arr[i][l] = sc.nextInt();
                }
                System.out.println();
            }

            System.out.println("Please enter the number ot find the location:");
            int x = sc.nextInt();
            int r = 0;
            int c = 0;
            // for output:
            for (int i = 0; i < row; i++) {// for row:

                for (int l = 0; l < colms; l++) {
                    if (x == arr[i][l]) {
                        r = i;//location of row:
                        c = l; // location of colomns:

                    }
                }
                System.out.println();
            }
            System.out.println(x + " is located at " + r + "," + c);
        }
    }
}
