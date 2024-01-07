import java.util.Scanner;

public class Data {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row and coloum respectively both matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int x[][] = new int[r][c];
        int y[][] = new int[r][c];
        int z[][] = new int[r][c];
        System.out.println("Enter the element for the first matrix");
        for (int i = 0; i < r; i++) {
            for (int l = 0; l < c; l++) {
                x[i][l] = sc.nextInt();
            }
        }
        System.out.println("Enter the element for the second matrix");
        for (int i = 0; i < r; i++) {
            for (int l = 0; l < c; l++) {
                y[i][l] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int l = 0; l < c; l++) {
                z[i][l] = x[i][l] + y[i][l];
            }
        }
        System.out.println("After the addition of the two array");
        for (int i = 0; i < r; i++) {
            for (int l = 0; l < c; l++) {
                System.out.print(z[i][l] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
