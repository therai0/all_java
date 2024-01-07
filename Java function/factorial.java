import java.util.Scanner;

public class factorial {
    public static void fact(int n) {
        int factorial = 1;
        if (n < 0) {
            System.out.println("You have enter the invalid number");
            return;
        }
        for (int l = 1; l <= n; l++) {
            factorial = l * factorial;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String argus[]) {
        System.out.println("Please enter the number to find the factorial:");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            fact(a);
        }
    }
}
