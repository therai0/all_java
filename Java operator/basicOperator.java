//basic of java operator

class basicOperator {
    public static  void main(String argus[] ) {
        // int i = 10;
        // int a = ++i;// preincrement:

        // System.out.println(i);//output will be 11;
        // System.out.println(a);//output will be 11:

        // int j = 10;
        // int h = j++; //post incerement

        // System.out.println(j);//11
        // System.out.println(h);//10 h assing the before the incerement 

        //left shift and right shift:

        // int a = 2;
        // System.out.println(a>>1);
        // System.out.println(a<<1);

        int a = 5;
        int b = 6;
        System.out.println(a&b);//bitwise AND operator
        System.out.println(a|b);// bitwise OR operator
        System.out.println(a^b);// bitwise  XOR operator
        System.out.println(~a);// bitwise complement operator
        System.out.println(a<<2);// bitwise left-shift operator
        System.out.println(a>>2);// bitwise right-shift operator
    }
}