package ee.annjakubel.codewars;

import ee.annjakubel.codewars.aresame.AreSame;
import ee.annjakubel.codewars.snail.Snail;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to my completed Codewars tasks!");

        int rows = 3;
        int columns = 3;

        int[][] array = new int[rows][columns];

        int value = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = value;
                value++;
            }
        }
        System.out.println(Arrays.toString(Snail.snail(array)));
    }
}
