
// input the array from the use and find the array is in asscending order or not:)
import java.util.*;

class inputArray {
    public static void main(String argus[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int arr[] = new int[size]; // for the size of the loop:
            // for input:
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            boolean isfalse = false;
            // checking the array is in ascending order or not:
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) { // checking the condition of the number:
                    isfalse = false;
                }
            }
            if (isfalse == false) { //if it is true it will display array isnot in ascending order:
                System.out.println("Array is not in Ascending order :(");
            } else {
                System.out.println("Array is in Ascending order :)");
            }
        }
    }
}