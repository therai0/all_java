// basic of string in java:
import java.util.*;
class basicString {
    public static void main(String argus[]) {
        
        Scanner sc = new Scanner(System.in);
        // System.out.println("What  is your name:");
        // String name = sc.nextLine();
        // System.out.println("Hello " + name);

        // String concatenation
        // length:
        // CharAt():
        //compare the string:
        //substr(begning,lastindex);
    
        // String name = sc.next();
        // String lastName = sc.next();
        // String fullname = name + " " + lastName;
        // System.out.println(fullname);
        // System.out.println( "The length of the string is " + fullname.length());

        // for(int i = 0 ; i < fullname.length(); i++) {
        //     //printing the all character of the fullnane:
        //     System.out.println(fullname.charAt(i));
        // }

        // output == 0 equal: output == -1 small : output == 1 bigger:
        String a = sc.next();
        String b = sc.next();
        System.out.println(a.compareTo(b));
        if(a.compareTo(b) >= 1) {
            System.out.println(a + " is greater then " + b);
        } else if(a.compareTo(b) < 0) {
            System.out.println(a + " is small the string " + b);
        } else {
            System.out.println("Both string are equal:");
        }


        sc.close();
    }
}