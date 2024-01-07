// number pattern Java:
class num {
    public static void main(String argus[]) {
        int limit = 5;
        for(int l = 1; l <= limit; l++) { // this loop is for row
            for(int i = 1; i <= l; i++) { // this is loop for coloumn or inner loop
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
