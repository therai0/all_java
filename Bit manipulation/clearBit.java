public class clearBit {
    public static void main(String argus[]) {
        int i = 10;
        int position = 2;
        int bitmask = 1<<position;

        int NOT = ~bitmask;

        int newNum = NOT & i;
        System.out.println("Clear Bit:" +newNum);
    }
}
