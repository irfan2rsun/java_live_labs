package week10;

public class MakeAbba {
    public static void main(String[] args) {
        String result = makeAbba("Hi", "Bye");
        System.out.println(result);
    }

    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }
}
