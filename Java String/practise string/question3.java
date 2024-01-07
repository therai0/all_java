//Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
// Example : 
// email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
// email = “helloWorld123@gmail.com”; username = “helloWorld123”

import java.util.*;
public class question3 {
    public static void main(String argus[]) {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Hey enter your email:");
        String email = sc.next();
        String username = " ";
        int position  = 0;
        for(int i = 0; i < email.length(); i++) {
            if(email.charAt(i) == '@')
            {
               position += i; 
                break;
            }
        }
        for(int  i = 0; i < position; i++) {
            username += email.charAt(i);
        }
        System.out.println("User name:" + username);
        
        
        sc.close();
    }
    
}
