package week07;

/*3. Create a class named BasicCalculator and
write a method which has name "calculate" to calculate the result;
		Example 1:
			int num1=5;
			int num2=7;
			char op='+'
			calculate(num1,num2,op);

		Output:
			Result : 12

		Example 1:
        			int num1=20;
        			int num2=5;
        			char op='/'
        			calculate(num1,num2,op);

        		Output:
        			Result : 4
 */
// Declare variable num1, num2, char op
// Create calculate method that return result
public class BasicCalculator {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 5;
        char op = '%';
        int result = calculate(num1, num2, op);
        System.out.println("Result : " + result);

    }

    static int calculate(int num1, int num2, char op) {

        switch (op) {
            case '+' -> {
                return num1 + num2;
            }
            case '-' -> {
                return num1 - num2;
            }
            case '*' -> {
                return num1 * num2;
            }
            case '/' -> {
                return num1 / num2;
            }
            case '%' -> {
                return num1 % num2;
            }
            default -> {
                return 0;
            }

        }

    }

}
