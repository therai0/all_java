//  Patter:
// 1. Print the solid pattern:

// class javaPattern {
//     public static void main(String argus[]) {
//         System.out.println("Solid pattern");

//         for (int l = 0; l < 4; l++) {

//             for (int i = 0; i < 5; i++) {
//                 System.out.print("*" + " ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// 2. Hollow pattern:

// class javaPattern {
//     public static void main(String argus[]) {
//         // outer loop:
//         for (int l = 1; l <= 4; l++) {
//             // inner loop:
//             for (int i = 1; i <= 5; i++) {
//                 if (i == 1 || i == 5 || l == 1 || l == 4) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
// }

// 3. half pyramid:

// class javaPattern {
//     public static void main(String argus[]) {
//         for( int l = 0; l <=5; l++) {
//             for(int i = 1; i <= l; i++ ) {
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// 3.Inverted half pyramid:

// class javaPattern {
//     public static void main(String argus[]) {
//         for (int l = 5; l >= 1; l--) {
//             for (int i = l; i >= 1; i--) {
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }

// same pattern easy to print the inverted pattern:
// class javaPattern {
//     public static void main(String argus[]) {
//         for (int l = 5; l >= 1; l--) {
//             for (int i = 1; i <= l; i++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// 4. Inverted half pyramid(180 deg)

// class javaPattern {
//     public static void main(String argus[]) {
//         // outer loop
//         int n = 5;
//         for (int l = 1; l <= n; l++) {
//             // inner loop for printing the space:
//             for (int i = 1; i <= n - l; i++) {
//                 System.out.print(" ");
//             }
//             // inner loop for printing the star:
//             for (int i = 1; i <= l; i++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// 6.Half pyramid with number:

// class javaPattern {
//     public static void main(String argus[]) {
//         for (int l = 1; l <= 5; l++) {
//             for (int i = 1; i <= l; i++) {
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }

// 7.Inverted half pyramid with Number:

// class javaPattern {
//     public static void main(String argus[]) {
//         for (int l = 5; l >= 1; l--) {
//             for (int i = 1; i <= l; i++) {
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }

// 8.Floyd's Triangle:

// class javaPattern {
//     public static void main(String argus[]) {
//         int a = 1;
//         for(int l = 1; l <= 5; l++) {
//             for(int i = 1; i <= l; i++) {
//                 System.out.print(a + " ");
//                 a++;
//             }
//             System.out.println();
//         }
//     }
// }

// .9) 0-1  Triangle
class javaPattern {
    public static void main(String argus[]) {
        int n = 5;
        for (int l = 1; l <= n; l++) {
            for (int i = 1; i <= l; i++) {
                int sum = i + l;
                if (sum % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }
}