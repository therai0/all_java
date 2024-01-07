import java.util.*;

public class changletter {
    public static void main(String argus[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the word:");
        String word = sc.next();
        StringBuffer sb = new StringBuffer(word);
        System.out.println("Please put letter to repalce:");
        String change = sc.next();
        System.out.println("you have enter the letter " + change + " and again input the new letter to replace it:");
        String another = sc.next();
        String modify = " ";
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == change.charAt(0)) {
                modify += another;
            } else {
                modify += word.charAt(i);
            }
        }
        System.out.println("Modify version = " + modify);
        sc.close();
    }
}
