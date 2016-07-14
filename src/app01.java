import java.util.Arrays;

public class app01 {
    public  static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 0, 8, 9, 7, 6, 2};
        System.out.println(Arrays.toString(array));
        for (int k = 0; k < array.length - 1; k++) {
            conditionlSwap(array, k, k + 1);
        }
        System.out.println(Arrays.toString(array));
    }
    public static void conditionlSwap(int[] array, int fst, int snd) {
        if (array[fst] > array[snd]) {
            int tmp = array[fst];
            array[fst] = array[snd];
            array[snd] = tmp;
        }
    }
}

