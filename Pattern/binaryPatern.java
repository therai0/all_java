// Binary pattern :
class binaryPatern {
    public static void main(String argus[]) {
        int limit = 5;
        int sum;
        for (int l = 1; l <= limit; l++) {
            for (int i = 1; i <= l; i++) {
                sum = i + l;
                if (sum % 2 == 0) { // if the condition is satisfy the it will print 1
                    System.out.print(" " + "1" + " ");
                } else {
                    System.out.print(" " + "0" + " "); // if this condition is satisfy then it will  print 0:
                }
            }
            System.out.println();
        }
    }
}
