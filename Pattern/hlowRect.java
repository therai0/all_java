// Hollow rectangle triangle:
class hlowRect {
    public static void main(String argus[]) {
        int limit = 5;
        for (int l = 1; l <= limit; l++) {
            for (int i = 1; i <= limit; i++) {
                if (i == 1 || i == 5 || l == 1 || l == 5) { // this is the condition:
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
// Explanetion
/* if the i  value is 1 or i value is 5 or l value is 1 or l value is 5 then
only the * will print.If the condition is not satisfy then it will print the space.*/
