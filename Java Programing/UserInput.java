import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Scanner;

class UserInput {
    public static void main(String argu[]) throws NumberFormatException, IOException 
    {
        // System.out.println("Hello world");
        // Scanner sc = new Scanner(System.in);
        // sc.close();


        // Another method to get the use input:

        BufferedReader bf = new BufferedReader(new  InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());

        System.out.println(a);
    }
}