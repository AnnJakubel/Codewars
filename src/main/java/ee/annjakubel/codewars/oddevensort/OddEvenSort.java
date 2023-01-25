package ee.annjakubel.codewars.oddevensort;

public class OddEvenSort {

    public OddEvenSort() {}

    public static String sortMyString(String s) {
        char tempArray[] = s.toCharArray();
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for (int i = 0; i < tempArray.length; i++) {
            if (i % 2 == 0) {
                even.append(tempArray[i]);
            } else {
                odd.append(tempArray[i]);
            }
        }

        return even.toString() + " " + odd.toString();
    }
}
