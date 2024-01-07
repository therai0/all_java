// holo pallindrom:

class holopallidrom {
    public static void main(String argus[]) {
        int limit = 6;
        for (int l = 1; l <= limit; l++) {
            for( int i = 1; i <= limit - l; i++) {
                System.out.print(" " + " ");
            }
            for(int i = 1; i <= limit; i++) {
                if(i == 1 || i == 6 || l == 1 || l == 6) {
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