//  Advance number pattern:Floyd's Triangle

class advencNum {
    public static void main(String agrus[]) {
        int l = 1;
        int limit = 5;
        for (int i = 1; i <= limit; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print(l + " ");
                l++;
            }
            System.out.println();
        }
    }
}
