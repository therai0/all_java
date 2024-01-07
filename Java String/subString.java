import java.util.Scanner;

public class subString {
    public static void main(String argus[]) {
        // String s = "Killeryt";

        // StringBuffer sb = new StringBuffer(s);
        // sb.reverse();

        // System.out.println(sb);

        Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter the new string:");
        
        // String n = sc.next();
        // StringBuffer sb = new StringBuffer(n);
       
       
       

       
        // for(int i = 0; i < sb.length()/2; i++) {
        //     int first = i; 
        //     int last = sb.length() - 1 - i;

        //     //for char:

        //     char firstChar = sb.charAt(first);
        //     char lastChar = sb.charAt(last);

        //     //set the character:

        //     sb.setCharAt(first, lastChar);
        //     sb.setCharAt(last, firstChar);
        // }

        // System.out.println(sb);

        System.out.println("Please enter the new string:");
        String a = sc.next();

        String B = a;
        String mod = "";

        for(int i = a.length()-1; i >=0; i--) {
            mod += a.charAt(i);
        }

        if(B.compareTo(mod)== 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
