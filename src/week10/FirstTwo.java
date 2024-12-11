package week10;

public class FirstTwo {
    public static void main(String[] args) {
        String result = firstTwo("Amira");
        System.out.println(result);
    }

    public static String firstTwo(String str) {
        if (str.length() <= 2) {
            return str;
        }
        return str.charAt(0) + "" + str.charAt(1);
    }
}
