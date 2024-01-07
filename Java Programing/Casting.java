/* type casting and type conversion:s */
public class Casting {
    public static void main(String argus[]) {
        int a = 20;
        byte b = 120;
        b = (byte)a;
        int x = 290;
        float xy = 123.33333f;
        double db = 12.22222222222222;
        byte c = 127;
        c = (byte)x;
        float ft = (float)x;
        byte bt = (byte)xy;
        int db_int = (int)db;
        

        byte m = 10;
        byte n = 40;
        int re = m * n;
        System.out.println("Promote the byte to integer: "+ re);
        // System.out.println(b);
        // System.out.println("After the type casting " + c);
        // System.out.println("Integer number to float: " + ft);
        // System.out.println("foating number to byte: " + bt);
        // System.out.println("Converting  Double into integer: "+db_int);
    }
}
