package ee.annjakubel.codewars;

import ee.annjakubel.codewars.createphonenumber.CreatePhoneNumber;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to my completed Codewars tasks!");
        CreatePhoneNumber createPhoneNumber = new CreatePhoneNumber();
        System.out.println(createPhoneNumber.createPhoneNumber(new int[] {3, 7, 2, 5, 5, 5, 8, 6, 9, 1}));
    }
}
