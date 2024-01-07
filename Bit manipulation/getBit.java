public class getBit {
    public static void main(String argu[]) {
        int i = 10;
        int position = 1;
        int bitMask = 1<< position;

        if((i & bitMask) == 0) {
            System.out.println("Bit was zero");
        } else {
            System.out.println("Bit is one");
        }
    }
}
