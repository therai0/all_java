import java.util.Scanner;

class basicFun { // creating the function:
    public static void myName(String nam) {
        System.out.println("His name is " + nam);
        return;// returning the function with no value cuz it is void:
    }

    public static void main(String argus[]) {
        System.out.println("Please enter the his name:");
        try (Scanner sc = new Scanner(System.in)) {
			String name = sc.nextLine();
			myName(name);// calling the function at main body
		}
    }
}