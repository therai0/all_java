import java.util.Scanner;

public class updateBit {
    public static void main(String argus[]) {
        System.out.println("Enter 1 or 0");
        Scanner sc = new Scanner(System.in);
        int i = 10;
        int position = 1; 
        int bitmask = 1<<position;
        int NOT = ~bitmask;
        int input = sc.nextInt();
        //bit update will update if the bit is 1 then it will be 0 vice versa:)

        //case 1: if bit is zero:
        if(input == 0) { 
        int newONE = NOT & i;
        System.out.println(" Bit is:" +newONE);
        } else {
            //case 2:if bit is one:
            int newOne = i | bitmask;
            System.out.println("Bit is:" +newOne);

        }
        sc.close();

    }
}
