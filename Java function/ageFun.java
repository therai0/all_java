import java.util.Scanner;

public class ageFun {
    public static int age(int a) {
        if(a >= 18) {
            return 1;
        }
        else {
            return 0;
        }
    }
    public static void main(String argus[]) {
        System.out.println("Enter your number");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int age = age(a);
            if(age == 1) {
                System.out.println("You are eligible for vote :)");
            }
            else {
                System.out.println("Sorry you age is still under 18 :(");
            }
        }
    }
}
