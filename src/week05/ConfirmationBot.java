package week05;

import java.util.Scanner;

/*
### Use a `switch statement` to create a confirmation bot. Given a `response` value as a `char`,
output a message based on the following:

> - if the response is `y` print the message: `Your request is being processed`
> - if the response is `n` print the message: `Thank you for your consideration`
> - if the response is `h` print the message: `Sorry, no live agents are currently available`
> - if the response is anything other than `y, n, or h` print: `Invalid entry, please try again`
 */
public class ConfirmationBot {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your response:");

        char response = input.next().charAt(0);

        switch (response) {
            case 'y' -> System.out.println("Your request is being processed");
            case 'n' -> System.out.println("Thank you for your consideration");
            case 'h' -> System.out.println("Sorry, no live agents are currently available");
            default -> System.err.println("Invalid entry, please try again");
        }

        input.close();

    }

}
