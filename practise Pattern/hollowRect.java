

// let's print the rectangle:

class hollowrect {
    public static void main(String argus[]) {
        for (int i = 1; i <= 6; i++) {
            for (int l = 1; l <= 8; l++) {
                if (i == 1 || i == 6 || l == 1 || l == 8) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        // long a = Long.MAX_VALUE;
        // System.out.println(a);
    }
}

