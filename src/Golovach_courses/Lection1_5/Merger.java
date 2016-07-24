package Golovach_courses.Lection1_5;

import java.util.Arrays;

public class Merger {

    public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        while (aIndex + bIndex != result.length) {
            if (a[aIndex] < b[bIndex]) {
                result[aIndex + bIndex] = a[aIndex++];

            } else {
                result[aIndex + bIndex] = b[bIndex++];
            }
        }
        return result;
    }

}
