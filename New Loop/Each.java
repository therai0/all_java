import java.util.*;

public class Each {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of words");
        int len = sc.nextInt();
        String str[] = new String[len];
        System.out.println(str.length);
        System.out.println("Enter the " + len + " words");
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
            // take single word
        }
        // for output with foreach loop
        System.out.println("Output");
        for (String x : str) {
            System.out.println(x);
        }
        sc.close();
    }
}
