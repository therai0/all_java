// 2D array --> double dieminsion:

import java.util.*;

class basic2D {
    public static void main(String argus[]) {

        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of the row");
			int row = sc.nextInt();// input for number of rows:
			System.out.println("Enter the number of coloumns:");
			int colms = sc.nextInt(); // input for number of colomns:

			int arr[][] = new int[row][colms]; // array:

			// outer loop is for row:
			System.out.println("Enter the number for array:");
			for (int i = 0; i < row; i++) {

			    // inner loop is for coloumns:
			    for (int l = 0; l < colms; l++) {
			        arr[i][l] = sc.nextInt();// input the number in 2D array:
			    }
			    System.out.println();
			}

			for (int i = 0; i < row; i++) {// for row:
			    for (int l = 0; l < colms; l++) {// colomns:
			        System.out.print(arr[i][l] + " ");// output
			    }
			    System.out.println();
			}
		}
    }
}