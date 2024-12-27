package week11;

public class Task1 {
    public static void main(String[] args) {

        String[] array = {"Java", "Python", "Python", "Ruby", "Ruby", "C#"};

        /*        System.out.println("array[0] = " + array[0]);
        System.out.println("array[1] = " + array[1]);

        // if you need to know the index of each element
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // if you need the element only
        for(String str : array){
            System.out.println(str);
        }*/

        // Get each element one by one
        for (String each : array) {
            // Count the elements
            int result = countElement(array, each);
            // If my count time is 1 means that element is unique
            if (result == 1) {
                System.out.println(each);
            }

        }

    }

    public static int countElement(String[] array, String each) {
        int counter = 0;
        for (String s : array) {
            if (s.equals(each)) counter++;
        }
        return counter;

    }//*

}



