package week06;

/*
2. Create a class named ConsecutiveNumbers and implement
a function with the following specifications:
   Given a positive integer N, the function should print
   consecutive numbers from 1 to N, with each number on a separate line.

   	However, there are special rules for certain numbers:
   		If a number is divisible by 2, replace it with the word "Alpha".
   		If divisible by 3, replace it with "Beta".
   		If divisible by 5, replace it with "Gamma".


   		If a number is divisible by more than one of these numbers (2, 3, or 5), replace it with a combination of the respective words in the order Alpha, Beta, and Gamma.

   	For example:
   		Numbers divisible by both 2 and 3 should be replaced by "AlphaBeta".
   		Numbers divisible by both 2 and 5 should be replaced by "AlphaGamma".
   		Numbers divisible by both 3 and 5 should be replaced by "BetaGamma".
   		Numbers divisible by all three (2, 3, and 5) should be replaced by "AlphaBetaGamma".


   			Here's an example of the function call:
   			 	consecutiveNums(31);

   		 	Output:
                    1
                    Alpha
                    Beta
                    Alpha
                    Gamma
                    AlphaBeta
                    7
                    Alpha
                    Beta
                    AlphaGamma
                    11
                    AlphaBeta
                    13
                    Alpha
                    BetaGamma
                    Alpha
                    17
                    AlphaBeta
                    19
                    AlphaGamma
                    Beta
                    Alpha
                    23
                    AlphaBeta
                    Gamma
                    Alpha
                    Beta
                    Alpha
                    29
                    AlphaBetaGamma
                    31

                    1. create function that print all the previous numbers with each number on separate line
                    2. for loop
                    3. num % 2 && num % 3 && num % 5 all equal to 0 num = AlphaBetaGamma
                    4. num % 2 num % 3 ==>
                    4. num % 2 == 0 replace num = "Alpha"
                    5. num % 3 == 0 replace num =
 */
public class ConsecutiveNumbers {
    public static void main(String[] args) {

        int n = 31;

        for (int i = 1; i <= n; i++) {
            String temp = "";


            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            } else {

                if (i % 2 == 0) {
                    temp += "Alpha";
                }

                if (i % 3 == 0) {
                    temp += "Beta";
                }

                if (i % 5 == 0) {
                    temp += "Gamma";
                }

                System.out.println(temp);

            }
        }
    }
}





