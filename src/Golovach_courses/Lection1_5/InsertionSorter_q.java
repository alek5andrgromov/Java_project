package Golovach_courses.Lection1_5;

import java.util.Arrays;

public class InsertionSorter_q {
    public static void sort(int[] arr) {
        for(int k =1; k<arr.length; k++) {
            int newElement = arr[k];
            int location = k -1;
            while (location >= 0 && arr[location] > newElement) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location+1] = newElement;
        }
    }


    public static void main(String[] args) {
        System.out.println(Arrays.binarySearch(new int[] {0}, -0));
    }
}
