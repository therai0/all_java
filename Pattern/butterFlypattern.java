//  Butterfly pattern:
class butterFlypattern {
    public static void main(String argus[]) {
        System.out.println("Butterfly pattern:");
        int limit = 4;
        // for outer loop or for row:
        for (int l = 1; l <= limit; l++) {
            // for first half pattern:
            for (int i = 1; i <= l; i++) {
                System.out.print("*" + " ");
            }
            // for space
            for (int i = 1; i <= 2 * (limit - l); i++) {
                System.out.print(" " + " ");
            }
            for (int i = 1; i <= l; i++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        // second half:
        for (int l = limit; l >= 1; l--) {
            // for first half pattern:
            for (int i = 1; i <= l; i++) {
                System.out.print("*" + " ");
            }
            // for space
            for (int i = 1; i <= 2 * (limit - l); i++) {
                System.out.print(" " + " ");
            }
            for (int i = 1; i <= l; i++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
