public class builderstring2 {
    public static void main(String argus[]){
       StringBuilder sb = new StringBuilder("Hero");
       System.out.println(sb);

       //sb.insert() method:
       sb.insert(0, "K");
       //it will add the k infront of Hero:
       System.out.println(sb);

       //delete the extra string: sb.delete()
       sb.delete(0, 1);
       System.out.println(sb);

       //append the new string:
       sb.append(" Bhaskar Rai");
       System.out.println(sb);
       System.out.println(sb.length());
    }
}
