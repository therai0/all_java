// Rombus pattern:

class rombus {
    public static void main(String argus[]) {
        int limit = 4;
        // for row or outer loop:
        for (int l = 1; l <= limit; l++) {
            // for space:
            for(int i = 1; i <= limit -l; i++)
            {
                System.out.print(" ");
            }
            // loop for star:
            for (int i = 1; i <= limit; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
