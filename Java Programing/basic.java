class Data {
    String name;
    int total;
    static int price;

    static// this is static block
    {
        System.out.println("it is static varibale");
    }
/* it will be called only the single time if the method is called for multiple time also */


    public Data()// this is constructor
     {
name = "Bhaskar";
total = 200;
System.out.println("this is consructor");
/* it will be called multiple times when it is called */
    }

}

class Basic {
    private static final String Data = null;

    public static void main(String a[]) {
// Data obj = new Data();
Class.forName(Data);
// with this method also we can call the static block
    }
}
