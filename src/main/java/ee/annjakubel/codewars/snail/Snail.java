package ee.annjakubel.codewars.snail;

import java.util.ArrayList;

public class Snail {

    public static int[] snail(int[][] array) {
        // enjoy

        int[] returnedArray = new int[array.length * array.length];
        int index = 0;

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                int value = array[row][column];
                returnedArray[index] = value;
                index++;
            }
        }
        return returnedArray;
    }
}
