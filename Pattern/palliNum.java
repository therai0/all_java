// Palindrom pyramid pattern:

public class palliNum {
    public static void main(String argus[]) {
        int limit = 5;
        // for outer loop: or for row:
        for(int l = 1; l <= limit; l++)  {
            // for space:
            for(int i = 1; i <= limit -l; i++) {
                System.out.print(" ");
            }
            // first half:
            for(int i = l; i >= 1; i--) {
                System.out.print(i);
            }
            // second half:
            for(int i = 2; i <= l; i++ ) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

