
// Basic of array which is known as non primetive data-type :)
// Syntax --> type[] arrayName = new type[size]; 
// Syntax --> type arrayName[] = new type[size]; 
// Syntax --> type arrayName[] = {1,2,4,5,6}; 

// class basicArray {
//     public static void main(String argus[]) {

//         int[] marks = new int[4];
//         marks[0] = 10;
//         marks[1] = 5;
//         marks[2] = 20;
//         marks[3] = 23;
//         for (int i = 0; i < 4; i++) {
//             System.out.println(marks[i]);
//         }

//     }
// }

// Taking the input from user :

// import java.util.Scanner;
// class basicArray {
//     public static void main(String argus[]) {
//         System.out.println("Plese input the size of the array");
//         try (Scanner sc = new Scanner(System.in)) {
//             int size = sc.nextInt();
//             int marks[] = new int[size];

//             // loop for input the marks :)
//             for (int i = 0; i < size; i++) {
//                 marks[i] = sc.nextInt();
//             }

//             // loop for output :)
//             System.out.println("Printing the Marks:");
//             for (int i = 0; i < size; i++) {
//                 System.out.println(marks[i]);
//             }
//         }
//     }

// }

import java.util.Scanner;

class basicArray {
    public static void main(String argus[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int marks[] = new int[size];

            // loop for input the marks :)
            System.out.println("Enter the  number");
            for (int i = 0; i < marks.length; i++) {
                marks[i] = sc.nextInt();
            }
            System.out.println("Enter the number to find the index :)");
            int x = sc.nextInt();
            // loop for output :)
            System.out.println("Printing the Marks:");
            for (int i = 0; i < marks.length; i++) {
                if (x == marks[i]) {
                    System.out.println(marks[i] + " is found at " + i + " :) ");
                }
            }
        }
    }
}
