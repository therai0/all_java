// Dymond pattern:
class dymond {
    public static void main(String argus[]) {
        int limit = 5;
        // for outer loop:
        for (int l = 1; l <= limit; l++) {
            // for space:
            for (int i = 1; i <= limit - l; i++) {
                System.out.print(" ");
            }
            // for printing the star:
            for (int i = 1; i <= l; i++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        // for second half:
        for (int l = limit; l >= 1; l--) {
            // for space:
            for (int i = 1; i <= limit - l; i++) {
                System.out.print(" ");
            }
            // for printing the star:
            for (int i = 1; i <= l; i++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
