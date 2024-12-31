package week11;

public class Task2 {
    public static void main(String[] args) {
        int[][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 40, 20}
        };

/*        int[] first = {1,2,3};
        int[] second = {4,5,6};
        // Putting first and second into one 2D array
        int[][] twoDimension = {first,second};*/
        int index = 0;
        for (int[] eachOneDimensionalArray : nums) {
            String result = prepare(eachOneDimensionalArray);// (3)(4)(5)(6)
            System.out.println("index " + index++ + " | " + result);

        }

    }

    private static String prepare(int[] eachOneDimensionalArray) {
        String result = "";
        for (int each : eachOneDimensionalArray) {
            result += "(" + each + ")";
        }
        return result;
    }

}
