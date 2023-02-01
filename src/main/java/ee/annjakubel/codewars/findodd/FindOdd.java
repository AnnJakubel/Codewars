package ee.annjakubel.codewars.findodd;

import java.util.ArrayList;

// --6 KYU--
public class FindOdd {
    /*
    Given an array of integers, find the one that appears an odd number of times.
    There will always be only one integer that appears an odd number of times.
    */
    public FindOdd() {
    }
    public static int findIt(int[] a) {
        int odd = -1;

        for (int num : a) {
            ArrayList<Integer> arrList = new ArrayList<>();

            for (int i = 0; i < a.length; i++) {
                if (num == a[i]) {
                    arrList.add(a[i]);
                }
            }

            if (arrList.size() % 2 != 0) {
                odd = arrList.get(0);
            }
        }
        return odd;
    }
}
