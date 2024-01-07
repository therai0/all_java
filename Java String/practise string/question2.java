// nput a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
// Example : 
// original = “eabcdef’ ; result = “iabcdif”
// Original = “xyz” ; result = “xyz”

import java.util.*;
public class question2 {
    public static void main(String argus[]) {

        System.out.println("Please enter the any name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String newName = "";
       for(int i = 0; i < name.length(); i++) {
        if(name.charAt(i) == 'e') {
            // if there is 'e' it will be replace by 'i':
           newName += 'i';
        } else {
            //if there is no 'e' same letter will be added to newName:
             newName += name.charAt(i);
        }
       }
       System.out.println(newName);
        sc.close();
    }
}
