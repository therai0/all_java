import java.util.Scanner;

public class sumFun { // creating the user define function with two parameters :)
    public static int sum(int a, int b) {
        return a + b; // returning the function :)
    }
    public static void main(String argus[]) {
        System.out.println("Please enter the two number");
        try (Scanner sc = new Scanner(System.in)) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            int add = sum(first, second);// calling the function with two argument :)
            System.out.println("the sum of the two number is " + add);
        }
    }
}
