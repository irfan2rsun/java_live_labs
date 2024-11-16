package week05;
/*
Given the integer variables speedLimit and currentSpeed, Write an if/else statement that calculates ticketAmount:
If currentSpeed is more than speedLimit, ticketAmount is $6 for each mile over the limit plus $51 processing fee.
if speeding, print out the result as below:
    ticketAmount = $183
If not speeding:
    Not speeding

Ex:
 speedLimit is 55, currentSpeed is 85
  Output:
    ticketAmount = $231

 speedLimit is 55, currentSpeed is 50
  Output:
    Not speeding

    1: declare variables speedLimit and currentSpeed
    2: wire if statement for $6 over 55 mph each mile
    3: printout ticketAmount each miles * $6
    4: else print out no speeding
 */
public class SpeedingTicket {
    public static void main(String[] args) {
        int speedLimit, currentSpeed;

        speedLimit = 55;
        currentSpeed = 85;

        if (speedLimit < currentSpeed) {
            System.out.println("ticketAmount = $" + (currentSpeed - speedLimit) * 6);
        } else {
            System.out.println("Not speeding");
        }
    }


}
