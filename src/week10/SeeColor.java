package week10;

public class SeeColor {
    public static void main(String[] args) {
        String result = seeColor("xxred");
        System.out.println(result);
    }

    public static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }

}