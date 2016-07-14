import java.util.Arrays;

/**
 * Created by RockX5G on 26.03.2016.
 */
public class App40 {
    public static void main(String[] args) {
        int[] x = {0, 1, 2};
        x = f(x);
        System.out.println("x: " + Arrays.toString(x));
    }

    public static int[] f(int[] x) {
        return new int[] {x[0] + 10,x[1]+10, x[2]+10};
    }
}
