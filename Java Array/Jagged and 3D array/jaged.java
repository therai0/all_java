import java.util.Scanner;
public class jaged {
    public static void main(String a[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows");
int r = sc.nextInt();
int x[][] = new int[r][];
int row_len[] = new int[r];
for(int i = 0; i < r; i++) {
    System.out.println("Enter the length of the " + (i+1) + " row");
    row_len[i] = sc.nextInt();
}
// creating the new object:
for(int i = 0; i < r; i++) {
    x[i] = new int[row_len[i]];
}

for(int i = 0; i < x.length; i++) {
    System.out.println("Enter the element for the " + (i+1) + " row");
    for(int l = 0; l < x[i].length; l++) {
        x[i][l] = sc.nextInt();
    }
}
// printing output:
System.out.println("Output");
for(int i = 0; i < x.length; i++) {
    for(int l = 0; l < x[i].length; l++) {
        System.out.print(x[i][l] + " ");
    }
    System.out.println();
}

sc.close();
    }
}
