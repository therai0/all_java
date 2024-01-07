// 1. Rectangle pattern:
// class prapattern {
//     public static void main(String argus[]) {
//         int limt = 3;
//         for (int l = 1; l <= limt; l++) {
//             for (int i = 1; i <= 5; i++) {
//                 System.out.print("*" + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// 2. half pyramid:

// class prapattern {
//     public static void main(String argus[]) {
//         System.out.println("Printing the half pyramid");
//         int limt = 5;
//         for (int l = 1; l <= limt; l++) {
//             for (int i = 1; i <= l; i++) {
//                 System.out.print("*" + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// 3. inverted half pyramid:

// class prapattern {
//     public static void main(String argus[]) {
//         System.out.println("Printing the inverted half pyramid:");
//         int limt = 5; 
//         for(int l = limt; l >= 1; l--) {
//             for(int i = l; i >= 1; i--) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// 4. half pyramid(180 deg):

// class prapattern {
//     public static void main(String argus[]) {
//         System.out.println("Inverted 180 deg half triangle:");
//         int limit = 5;
//         for (int l = 1; l <= limit; l++) {
//             for (int i = 1; i <= limit - l; i++) {
//                 System.out.print(" ");
//             }
//             for (int i = 1; i <= l; i++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// 5. hollow rectangle:

// class prapattern {
//     public static void main(String argus[]) {
//         System.out.println("Hollow rectangle:");
//         int limit = 5;
//         for (int l = 1; l <= limit; l++) {
//             for (int i = 1; i <= limit; i++) {
//                 if (i == 1 || i == 5 || l == 1 || l == 5) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// 6. half pyramid with number:

// class prapattern {
//     public static void main(String argus[]) {
//         int limit = 5;
//         for (int l = 1; l <= limit; l++) {
//             for (int i = 1; i <= l; i++) {
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// 7. inverted pyramid with number:

// class prapattern {
//     public static void main(String argus[]) {
//         int limit = 5;
//         for (int l = limit; l >= 1; l--) {
//             for (int i = l; i >= 1; i--) {
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//    }
// }

// 8. Floyd's Triangle using number:

// class prapattern {
//     public static void main(String argus[]) {
//         int a = 1;
//         int limit = 5;
//         for (int i = 1; i <= limit; i++) {
//             for (int l = 1; l <= i; l++) {
//                 System.out.print(a + " ");
//                 a++;
//             }
//             System.out.println();
//         }
//     }
// }

// 9. 0-1 triangle pattern:

class prapattern {
    public static void main(String argus[]) {
        int limit = 5;
        for (int l = 1; l <= limit; l++) {
            for (int i = 1; i <= l; i++) {
                if ((i + l) % 2 == 0) {
                    System.out.print(" " + "1" + " ");
                } else {
                    System.out.print(" " + "0" + " ");
                }
            }
            System.out.println();
        }
    }
}
