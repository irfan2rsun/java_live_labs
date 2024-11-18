package week06;

/*
1. Create a class named DivideTwoNumbers and
write a program that can perform division of
two numbers without using the division (/) and
multiplication (*) operators.

		Example:
			n1 = 100
			n2 = 6

		Output:
			16 with a remainder of 4

		1. declare variable num1 num2
		2. create a method to divide the number
 */
public class DivideTwoNumbers {
    public static void main(String[] args) {

        divideTwoNumbers(100,6);

    }

    static void divideTwoNumbers(int num1, int num2) {

        System.out.println(num1 / num2 + " with a remainder of " + num1 % num2);

    }

}
