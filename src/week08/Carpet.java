package week08;

public class Carpet {

    double width;
    double length;
    double unitPrice;
    boolean isPersian;
//    double totalPrice;

    @Override
    public String toString() {
        return "Carpet{" +
                "width = " + width +
                ", length = " + length +
                ", unitPrice = $" + unitPrice +
                ", totalPrice = $" + /*totalPrice*/ calcCost() +
                ", isPersian=" + isPersian +
                '}';
    }

/*    static double calcCost(double width, double length, double unitPrice, boolean isPersian) {

        if (!isPersian) {
            return (width * length) * unitPrice;
        } else {
            return (width * length) * unitPrice + 200;
        }*/

    public double calcCost() {

        double totalCost = width * length * unitPrice;

        if (isPersian) {
            totalCost = totalCost + 200;
        }

        return totalCost;

    }

}


