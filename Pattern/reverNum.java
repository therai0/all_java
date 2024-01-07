//  inverted half triangle:
class reverNum {
    public static void main(String argus[]) {
        int limit = 5;
        for (int l = limit; l >= 1; l--) {
            for (int i = l; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
