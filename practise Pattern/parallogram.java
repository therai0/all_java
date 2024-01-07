//let's print the parallogram:

class parallogram {
    public static void main(String argus[]) {
        for(int i = 1; i <= 6; i++) {
            for(int l = 1; l <= 6-i; l++) {
                System.out.print(" " + " ");
            }

            for(int l = 1; l <= 8; l++) {
                if(l ==1 || l == 8 || i == 1 || i == 6) {
                    System.out.print("*" + " ");
                } 
                else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}