package week08;

public class CarpetClients {
    public static void main(String[] args) {

        Carpet carpet = new Carpet();

        carpet.width = 5;
        carpet.length = 10;
        carpet.unitPrice = 5;
        carpet.isPersian = true;
        carpet.calcCost();

        System.out.println(carpet);

        System.out.println("---------------------------");

        Carpet carpet1 = new Carpet();

        carpet1.width = 10;
        carpet1.length = 5;
        carpet1.unitPrice = 10;
        carpet1.isPersian = false;
        carpet1.calcCost();

        System.out.println(carpet1);

    }
}
