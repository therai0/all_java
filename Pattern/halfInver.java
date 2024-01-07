// Inverted half triangle:

// class halfInver {
//     public static void main(String argus[]) {
//         int limit = 4;
//         // for row:
//         for (int l = limit; l >= 1; l--) {
//             for (int i = l; i >= 1; i--) { //for column or inner loop:
//                 //it will run for 4 times cuz l value is 4 so it will run till the value if l !=
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Demo
class halfInver {
    public static void main(String argus[]) {
        int limit = 5;
        for(int l = limit; l >= 1;l--)  {
            for(int i = 1; i <= l; i++)  {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
