public class builder {

    public static void main(String argu[]) {
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println(sb.charAt(0));

        sb.delete(1,2);
        System.out.println(sb);

        sb.insert(1,'e');
        System.out.println(sb);
    }

}
