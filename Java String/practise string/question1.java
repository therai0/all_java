// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.*;

class question {
    public static void main(String argus[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of number you want to store:");
        int s = sc.nextInt();

        String name[] = new String[s];
        System.out.println("Enter the " + s + " number of name ?");
        for (int i = 0; i < s; i++) {
            name[i] = sc.next();
        }

        int totalLength = 0;
        for (int i = 0; i < s; i++) {
            totalLength += name[i].length();
        }

        System.out.println("the lenght of the all full string = " + totalLength);
        sc.close();
    }
}