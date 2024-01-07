// Array of the object:
class Obj {
    String name;
    int roll;
}

public class ArrObj {
    public static void main(String ar[]) {
        Obj a = new Obj();
        a.name = "Bhaskar";
        a.roll = 10;

        Obj b = new Obj();
        b.name = "Hero";
        b.roll = 12;
        Obj c = new Obj();
        c.name = "C-program";
        c.roll = 20;

        // creating the array of the object
        Obj info[] = new Obj[3];
        info[0] = a;
        info[1] = b;
        info[2] = c;

        // for(int i = 0; i < info.length; i++) {
        // System.out.println(info[i].name + " " + info[i].roll);
        // }

        for (Obj x : info) {
            System.out.println(x.name + " " + x.roll);
        }

    }
}
