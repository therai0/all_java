// Mutable string:)
import java.util.*;
public class builderString {
    public static void main(String argus[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the any word:");
        String name = sc.next();
        StringBuilder sb = new StringBuilder(name);

        //we can display the any character without using loop:
        // System.out.println(sb.charAt(0));

        //we can set the new character in string:
        sb.setCharAt(0, 'l');
        System.out.println(sb);

        sc.close();
    }
}
