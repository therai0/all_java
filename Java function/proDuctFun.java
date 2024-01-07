import java.util.Scanner;

public class proDuctFun {
    public static int productNum(int x, int y) {
        return x * y;
    }

    public static void main(String argus[]) {
        System.out.println("Enter the two number");
        try (Scanner sc = new Scanner(System.in)) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            int prduct = productNum(first, second);
            System.out.println("the product of the two number is " + prduct);
        }
    }
}
