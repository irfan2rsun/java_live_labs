package week08;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Java Hotel!");

        System.out.println("How many days will you stay?");
        int numberOfDayStaying = input.nextInt();

        System.out.println("How many people are in your party");
        int numberOfPeople = input.nextInt();

        int price = 0;
        String roomType = "";

        switch (numberOfPeople) {
            case 1 -> System.out.println(roomType = "| single room |" + " price: $" + numberOfDayStaying * 100);
            case 2 -> System.out.println(roomType = "| double room |" + " price: $" + numberOfDayStaying * 125);
            case 3, 4 -> System.out.println(roomType = "| large room |" + " price: $" + numberOfDayStaying * numberOfPeople * 50);
            case 5, 6 -> System.out.println(roomType = "| suite |" + " price: $" + numberOfDayStaying * 1000);
            default -> System.err.println("Sorry " + numberOfPeople + " is not a valid group size");
        }

    }

}
