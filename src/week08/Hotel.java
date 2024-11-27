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

        input.close();

        int price = 0;
        String roomType = "";// In order to utilize these two variables adjust the code below to

        switch (numberOfPeople) {
            case 1 -> {
                roomType = "| single room |";
                price = numberOfDayStaying * 100;
            }
            case 2 -> {
                roomType = "| double room |";
                price = numberOfDayStaying * 125;
            }
            case 3, 4 -> {
                roomType = "| large room |";
                price = numberOfDayStaying * numberOfPeople * 50;
            }
            case 5, 6 -> {
                roomType = "| suite |";
                price = numberOfDayStaying * 1000;

            }
            default -> {
                System.err.println("Sorry " + numberOfPeople + " is not a valid group size");
                return;
            }

        }

        System.out.println("people " + numberOfPeople + " " + roomType + " price:" + price);

    }

}
