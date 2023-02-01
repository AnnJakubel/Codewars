package ee.annjakubel.codewars.smilefaces;

import java.util.List;

// --6 KYU--
public class SmileFaces {
    public SmileFaces() {}

    public static int countSmileys(List<String> arr) {
        int count = 0;
        char[] indexZero = {':', ';'};
        char[] indexOne = {'-', '~'};
        char[] indexTwo = {'D', ')'};

        for (String smiley : arr) {
            if (smiley.charAt(0) == indexZero[0] || smiley.charAt(0) == indexZero[1]) {
                if (smiley.charAt(1)==indexOne[0] || smiley.charAt(1) == indexOne[1]) {
                    if (smiley.charAt(2)==indexTwo[0] || smiley.charAt(2) == indexTwo[1]) {
                        if (smiley.length() == 3) {
                            count++;
                        }
                    }
                } else if (smiley.charAt(1)==indexTwo[0] || smiley.charAt(1) == indexTwo[1]) {
                    if (smiley.length() == 2) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

/*
Alternate solution with using .stream()

  public static int countSmileys(List<String> arr) {
    return (int)arr.stream().filter( x -> x.matches("[:;][-~]?[)D]")).count();
  }

 */
