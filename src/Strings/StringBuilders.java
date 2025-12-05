package Strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("ShaileshPaul");
        System.out.println(sb);
        System.out.println(sb.length()+" "+sb.capacity());
        sb.append("Kumar");
        System.out.println(sb);
    }
}
