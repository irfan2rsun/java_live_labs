package week05;

/*
3)-------- ALARM CLOCK ------------

Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat,
and a boolean indicating
if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring.
Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00".
Unless we are on vacation -- then on weekdays it should be "10:00"
and weekends it should be "off".

vacation -> weekdays -> "10:00"
		 -> weekends -> "off"
not vacation -> weekdays -> "7:00"
		 	 -> weekends -> "10:00"

int day = 1;
boolean vacation = false;
String alarm = "7:00"

int day = 5;
boolean vacation = true;
String alarm = "10:00"

alarmClock(1, false) → "7:00"
alarmClock(5, false) → "7:00"
alarmClock(0, false) → "10:00"

1. declare variables and assign them 1=M...
2. boolean onVacation
 */
public class AlarmClock {
    public static void main(String[] args) {

        alarmClock(0, false);
        alarmClock(1, true);
        alarmClock(0, false);
        alarmClock(6, true);
    }

    static void alarmClock(int weekDay, boolean onVacation) {

        if (weekDay >= 1 && weekDay <= 5 && onVacation == true) {
            System.out.println("10:00");
        } else if (weekDay >= 1 && weekDay <= 5 && onVacation == false) {
            System.out.println("7:00");
        } else if (weekDay == 6 || weekDay == 0 && onVacation == true) {
            System.out.println("off");
        } else if (weekDay == 6 || weekDay == 0 && onVacation == false) {
            System.out.println("10:00");
        } else {
            System.err.println("Invalid input");
        }

    }

}
