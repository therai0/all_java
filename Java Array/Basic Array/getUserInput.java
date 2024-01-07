import java.util.*;

class getUserInput {
    public static void main( String argus[]) {
        System.out.println("Please enter the number");
        try (Scanner sc = new Scanner(System.in)) {
			int arr[] = new int[5];
			// getting input form user:
			for (int l = 0; l < arr.length; l++) {
			    arr[l] = sc.nextInt();
			}

			// printing the number as output:
			for (int i = 0; i < arr.length; i++) {
			    System.out.println(arr[i]);
			}
		}
    }
}