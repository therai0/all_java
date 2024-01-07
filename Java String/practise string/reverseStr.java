import java.util.*;

public class reverseStr {
    public static void main(String argus[]) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the any String:");
    //     String name = sc.next();
    //     StringBuffer sb = new StringBuffer(name);

    //     String modify = " ";

    //     for(int i = sb.length()-1; i >= 0; i--){
    //     modify += sb.charAt(i);
    //     }

        
    //     System.out.println("The reverse of the string is = " + modify);
    //     sc.close();

        // method 2:

        Scanner sc = new Scanner(System.in);
        System.out.println("Entere the any string:");
        String name = sc.next();

        StringBuffer sb = new StringBuffer(name);

        for (int i = 0; i < sb.length()/2; i++) {

            // get the index:
            int front = i;
            int back = sb.length() - 1 - i; // it will be the last char of the string:

            char fontChar = sb.charAt(front);
            char lastChar = sb.charAt(back);

            // replacing the front char with last:

            sb.setCharAt(front, lastChar);
            sb.setCharAt(back, fontChar);

        }
        System.out.println("Reverse = " + sb);
        sc.close();
    }
}
