package week10;

public class FrontAgain {
    public static void main(String[] args) {
        boolean result = frontAgain("ede");
        System.out.println(result);
    }

    public static boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        }
        String firstTwoChars = str.substring(0,2);
        return str.endsWith(firstTwoChars);
    }
}
