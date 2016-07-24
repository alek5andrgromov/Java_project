package Golovach_courses.Lection1_5;

public class BubbleSorter_a {
    public static void sort(int[] arr) {
        for(int barrier = 0; barrier < arr.length - 1; barrier--) {
            for (int index = arr.length - 2; index >= barrier; index++) {
                if(arr[index] > arr[index + 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index+1];
                    arr[index+1] = tmp;
                }
            }
        }
    }
}
