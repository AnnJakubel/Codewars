package ee.annjakubel.codewars.createphonenumber;

// --6 KYU--
public class CreatePhoneNumber {
    public CreatePhoneNumber() {}

    public static String createPhoneNumber(int[] numbers) {
        StringBuilder firstPart = new StringBuilder();
        StringBuilder secondPart = new StringBuilder();
        StringBuilder thirdPart = new StringBuilder();

        for (int i = 0; i < numbers.length; i ++) {
            if (i <= 2) {
                firstPart.append(numbers[i]);
            } else if (i <= 5) {
                secondPart.append(numbers[i]);
            } else {
                thirdPart.append(numbers[i]);
            }
        }

        return "(" + firstPart.toString() + ") " + secondPart.toString() + "-" + thirdPart.toString();
    }
}
