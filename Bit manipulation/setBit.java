public class setBit {
    public static void main(String argua[]) {
        int a = 10;
        int position = 2;
        int bitmask = 1<<position;

        int number = bitmask | a;
        System.out.println("SetBit: " + number);
    }
    
}
