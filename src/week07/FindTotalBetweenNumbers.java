package week07;

/*
2. Create a class named FindTotalBetweenNumbers and
write a method which has name "sum" to sum up from first number to second number;
		Example:
			int num1=5;
			int num2=7;
			sum(num1,num2);

		Output:
			Total : 18
 */
// Declare variable num1, num2, total
// total += num1;
public class FindTotalBetweenNumbers {
    public static void main(String[] args) {

        System.out.println(sum(5, 7));

    }

    static int sum(int num1, int num2) {

        int total = 0;

        for (int i = num1; i <= num2; i++) {

            total += i;

        }

        return total;

    }

}
