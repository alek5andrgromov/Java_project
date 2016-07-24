package Golovach_courses.Lection1_5;

import java.sql.Array;
import java.util.Arrays;

public class app00 {
    public  static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 0, 8, 9, 7, 6, 2};
        System.out.println(Arrays.toString(array));
        for (int k = 0; k < array.length - 1; k++) {
            swap(array, k, k + 1);
        }
        System.out.println(Arrays.toString(array));
    }
    public static void swap(int[] array, int fst, int snd) {

          int tmp = array[fst];
          array[fst] = array[snd];
          array[snd] = tmp;

    }
}

