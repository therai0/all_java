import java.util.Scanner;

public class ThreeD {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        int x[][][] = new int[2][2][2];
        System.out.println("Enter the element for the 2x2x2 matrix(3D)");
        for(int i = 0; i < 2; i++) {
            for(int l = 0; l < 2; l++) {
                for(int j = 0; j < 2; j++) {
                    x[i][l][j] = sc.nextInt();
                }
            }
        }
        System.out.println("Output of 3D array");
        for(int i = 0; i < 2; i++) {
            for(int l = 0; l < 2; l++) {
                for(int j = 0; j < 2; j++) {
                   System.out.print(x[i][l][j] + " ");
                }
                System.out.print("|");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
