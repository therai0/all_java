// StringBuffer and StringBuilder make the string mutable:

public class strbuffer {
    public static void main(String a[]) {
StringBuffer str = new StringBuffer("Bhaskar");
System.out.println(str.capacity());
System.out.println(str.length());
str.append(" Hero");
System.out.println(str);
    }
}
