
import java.util.Scanner;

class LoopNew {
    public static void main(String a[]) {
        // int[] x = { 12, 34, 4, 65, 3 };
        // for (int i : x) {
        // System.out.println(i);
        // }

        // String[] name = {"rita","Sita","Mite","Kita"};
        // for(String i:name) {
        // System.out.println(i);
        // }

        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        System.out.println("Enter the " + x.length + " number");
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }

        System.out.println("Ouput");
        for(int l:x) {
            System.out.print(l + " ");
        }
        sc.close();
    }
}