package week10;

public class WithoutEndAndFirst {
    public static void main(String[] args) {
        String result = withoutEnd("ab");
        System.out.println(result);
    }

    public static String withoutEnd(String str) {
        str = str.substring(1, str.length() - 1);
        return str;
    }
}
