package week05;
/*
    You are driving a little too fast, and a police officer stops you.
    Write code to compute the result, encoded as an int value:
    0=no ticket,
    1=small ticket,
    2=big ticket.
    If speed is 60 or less, the result is 0.
    If speed is between 61 and 80 inclusive, the result is 1.
    If speed is 81 or more, the result is 2.
    Unless it is your birthday -- on that day,
    your speed can be 5 higher in all cases.

    1. declare variable speed, result, and todayIsUrBirthday
    2. write if else statement print out result
    3.  speed <= 60 result = 0
        61<= speed <= 80 result = 1
        speed>=81 result = 2
        if todayIsUrBirthday is true speed - 5
 */
public class CaughtSpeeding {
    public static void main(String[] args) {

        int speed = 86;
        boolean todayIsUrBirthday = true;

        if (todayIsUrBirthday == true) {
            speed -= 5;
        }

        if (speed <= 60) {
            System.out.println("result = 0 = no ticket");
        } else if (61 <= speed && speed <= 80) {
            System.out.println("result = 1 = small ticket");
        } else {
            System.out.println("result = 2 = big ticket");
        }

    }

}


