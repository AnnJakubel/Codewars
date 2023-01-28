package ee.annjakubel.codewars;

import ee.annjakubel.codewars.findodd.FindOdd;


public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to my completed Codewars tasks!");
        FindOdd findOdd = new FindOdd();
        int[] arr = {1,1,1,1,1,1,10,1,1,1,1};
        System.out.println(findOdd.findIt(arr));
    }
}
