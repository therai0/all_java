class bitmanipulation {
    public static void main(String argus[]) {
        //get
        //set 
        //clear
        //update

        int a = 10; 
        int pos = 2; 
        int bitmask = 1<<pos;//bitmask:
        int num = bitmask | a;

        //get bit
        if((bitmask & a) == 0) {
            System.out.println("Bit is zero");
        } else {
            System.out.println("Bit is one.");
        }
        //set bit:
        System.out.println( "Set bit:" + num);

        //clear bit:
        int notBitmask = ~(bitmask);
        int newNum = a & notBitmask;
        System.out.println("Clear bit:" +newNum);
    }
}