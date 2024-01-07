// let's print the reverse 180deg half triangle:

class reverse180deg {
    public static void main(String argus[]) {
        int limit = 5;
        for (int l = 1; l <= limit; l++) {
            // for printing the space:

            for (int i = 1; i <= limit - l; i++) {
                System.out.print(" " + " ");
            }
            // for printing the star:
            for (int i = 1; i <= l; i++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}