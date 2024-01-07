// Number pyramid:
class numberPyramid {
    public static void main(String argus[]) {
        int limit = 5;
        // for outer loop:
        for(int l = 1; l <= limit; l++) {
            
            for(int i = 1; i <= limit - l; i++) {
                System.out.print(" ");
            }
            // for inner loop or for number:
            for(int i = 1; i <= l; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
