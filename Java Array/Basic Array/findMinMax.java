import java.util.*;

class findMinMax {
    public static void main(String argus[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter the size of the array");
            int a = sc.nextInt();
            int arr[] = new int[a];

            // for input the number:
            for(int l = 0; l < arr.length; l++) {
                arr[l] = sc.nextInt();
            }
            int maxNum = arr[0];
            int minMum = arr[0];

            // for output 
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] > maxNum) { //condition for maximum number:
                    maxNum = arr[i];
                }

                if(arr[i] < minMum) { //condition for minimum number:
                    minMum = arr[i];
                }
            }
            System.out.println("The maximum number " + maxNum);
            System.out.println("The minimum number " + minMum);
        }
    }
}