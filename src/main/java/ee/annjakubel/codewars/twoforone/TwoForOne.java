package ee.annjakubel.forcodewars.twoforone;
import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

public class TwoForOne {

    public TwoForOne() {
    }
    public static String longest(String s1, String s2) {
        // your code
        String addedString = s1 + s2;
        char tempArray[] = addedString.toCharArray();
        Arrays.sort(tempArray);
        StringBuilder str = new StringBuilder();

        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : tempArray) {
            charSet.add(c);
        }

        for (Character character : charSet) {
            str.append(character);
        }

        return str.toString();
    }
}
