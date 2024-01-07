// Array of string and number:

// import java.util.Scanner;

// class Data {
//     String name;
//     String add;
// }

// public class Strcut {
//     public static void main(String a[]) {
//         Scanner sc = new Scanner(System.in);
//         Data info[] = new Data[2];

//         Data A1 = new Data();
//         System.out.println("Enter the name");
//         A1.name = sc.nextLine();
//         System.out.println("Enter the address");
//         A1.add = sc.nextLine();

//         Data A2 = new Data();
//         System.out.println("Enter the name of second person");
//         A2.name = sc.nextLine();
//         System.out.println("Enter the address of second person");
//         A2.add = sc.nextLine();

//         info[0] = A1;
//         info[1] = A2;
//         for (int i = 0; i < 2; i++) {
//             System.out.println(info[i].name + ":" + info[i].add);
//         }
//         sc.close();
//     }
// }


// Store the N number of data of student:

import java.util.Scanner;

class Data {
    String name;
    int age;
    String add;
}

class Struct {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of student to store the data of student");
        int n = sc.nextInt();
Data info[] = new Data[n];
for(int i = 0; i < info.length; i++) {
   info[i] = new Data();
}
for(int i = 0; i < info.length; i++) {
    System.out.println("Enter the " + (i+1) + " index name");
   info[i].name = sc.nextLine();

   System.out.println("Enter the " + (i+1) + " index age");
   info[i].age = sc.nextInt();

   System.out.println("Enter the " + (i+1) + " index address");
   info[i].add = sc.nextLine();
}

// output:
for(int i = 0; i < info.length; i++) {
    System.out.println(info[i].name + ":"+info[i].add + ":"+ info[i].add);
}
sc.close();
    }
}
