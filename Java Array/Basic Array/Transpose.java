import java.util.Scanner;

public class Transpose {
    public static void main(String a[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the row and coloum of the matrix");
        int r = in.nextInt();
        int c = in.nextInt();
        int x[][] = new int[r][c];
        int z[][] = new int[c][r];
        System.out.println("Enter the element for the matrix");
        for (int i = 0; i < r; i++) {
            for (int l = 0; l < c; l++) {
                x[i][l] = in.nextInt();
            }
        }
        for(int i = 0; i < c; i++) {
            for(int l = 0; l < r; l++) {
                z[l][i] = x[i][l];
            }
        }
        System.out.println("After traspose the matrix");
        for(int i = 0; i < c; i++) 
        {
            for(int l = 0; l < r; l++) {
                System.out.print(z[i][l] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
