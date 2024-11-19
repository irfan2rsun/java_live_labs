package week07;

/*
1. Create a class named FindTotalNumbers and
write a method which has name "sum" to sum up from 1 to given number;
		Example:
			int n=5;
			sum(n);

		Output:
			Total : 15
 */
// Declare a variable store the given number and the total number
// Using for loop to adding the new number to the total number
public class FindTotalNumbers {
    public static void main(String[] args) {

        int n = 5;
        sum(n);

    }

    static void sum(int n) {

        int total = 0;

        for (int i = 1; i <= n; i++) {

            total += i;

        }

        System.out.println(total);

    }

}
