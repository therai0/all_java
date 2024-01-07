// taking the input and printing the number in spiral order :)

import java.util.*;

public class spiralOrder {
    public static void main(String argus[]) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.println("Enter the number of row:");
            int r = sc.nextInt();
            System.out.println("Enter the number of colomn:");
            int c = sc.nextInt();
            int firstRow = 0;
            int lastRow = r - 1;
            int firstColm = 0;
            int lastColm = c - 1;

            int spiral[][] = new int[r][c];
            // part one for input:

            System.out.println("Please enter the element for the matrix");
            // outer loop for row:
            for (int l = 0; l < r; l++) {
                // inner loop for colmns:
                for (int i = 0; i < c; i++) {
                    spiral[l][i] = sc.nextInt();// getting the input:
                }
            }
            // condition for printing the spiral matrix:
            while (firstRow <= lastColm && firstColm <= lastColm) {

                // loop for first line:
                // left to right:
                for (int l = firstRow; l <= lastColm; l++) {
                    System.out.print(spiral[firstColm][l] + " ");
                }
                firstRow++;
                // increase the value of row by 1:

                // loop for top to buttom:
                for (int l = firstRow; l <= lastRow; l++) {
                    System.out.print(spiral[l][lastColm]+ " ") ;
                }

                lastColm--;
                // decrease the value of colmn whit 1:
                // loop for right to left:
                for (int l = lastColm; l >= firstColm; l--) {
                    System.out.print(spiral[lastRow][l] + " ");
                }

                lastRow--;
                // decrease the value of row by 1:
                // //loop for bottom to top:
                for (int l = lastRow; l >= firstRow; l--) {
                    System.out.print(spiral[l][firstColm] + " ");
                }
                firstRow++;
                // increase the value of row by 1:

                System.out.println();

            }

        }
    }
}
