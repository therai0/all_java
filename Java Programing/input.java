
// Taking the user input;
// Array in java;
import java.util.Scanner;

class UserInput {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the element for the Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element for array are given below:");
        for(int i = 0; i < n ; i++) {
            System.out.println("Element at "+ i + " index is " +arr[i]);
        }
        sc.close();
    }
}