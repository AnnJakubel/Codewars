package ee.annjakubel.codewars.aresame;

import java.util.Arrays;

// --6 KYU--
public class AreSame {
    public AreSame() {}

    public static boolean comp(int[] a, int[] b) {
        //gotta compare all numbers between the two arrays
        //ill try for loop, then later streams
        // b is a^2
        //needs to return either true or false
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        boolean firstCheck = true;
        if (a == null || b == null){
            return false;
        } else if (a.length != b.length) {
            return false;
        }

        for (int i : a) {
            for (int j : b) {
                if (j == i*i) {
                    firstCheck = true;
                    break;
                } else {
                    firstCheck = false;
                }
            }
            if (firstCheck == false) {
                return false;
            }
        }
        return firstCheck;
    }
}
