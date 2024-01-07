// revers Triangle 180 deg:
class reverTriHalf {
    public static void main(String argus[]) {
        int limit = 5;
        for (int l = 1; l <= limit; l++) {
            for (int i = 1; i <= limit - l; i++) { //line 1
                System.out.print(" ");
            }
            for (int a = 1; a <= l; a++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
/* line 1 ---> the condition (limit - l) is the value is limit is 5 sub l which value is 1 outout
 * will be 5-1 = 4: so in first line it will display the four space: When the value of l become 5 it will not print any space. So all star will be print:
 */