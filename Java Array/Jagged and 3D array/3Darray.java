
import java.util.Scanner;

class Jagged {

    public void twoD() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and coloum");
        int r = sc.nextInt();
        int l = sc.nextInt();
        int arr[][] = new int[r][l];
        System.out.println("Enter the element for the 2D array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < l; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Output of 2D array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public void jaggeD() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int r = sc.nextInt();
        int arr[][] = new int[r][];
        int row_arr[] = new int[r];
        for (int i = 0; i < r; i++) {
            System.out.println("Enter the length of the " + (i + 1) + " row");
            row_arr[i] = sc.nextInt();
        }
        for(int i = 0; i < r; i++) {
            arr[i] = new int[row_arr[i]];
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element for the "+ (i+1) + " row");
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Jagged Array:");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

class Three_d {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the your choice");
        System.out.println("1.2D array");
        System.out.println("2.3D array");
        int n = sc.nextInt();

        Jagged obj = new Jagged();

        switch (n) {
            case 1:
                obj.twoD();
                break;
            case 2:
                obj.jaggeD();
                break;
            default:
                System.out.println("Invalid number");
        }
        sc.close();
    }
}