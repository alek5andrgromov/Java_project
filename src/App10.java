
public class App10 {
    public static void main(String[] args) {
        int[] arr = {0, 10, 20, 30, 40};
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j< arr.length-i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }

}
