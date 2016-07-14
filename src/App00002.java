/**
 * Created by RockX5G on 26.03.2016.
 */
import java.util.Arrays;

public class App00002 {

    public static void main(String[] args) {
        int[] x = {0,1,2};
        int[] y = x;
        x = null;
        System.out.println("x = " + Arrays.toString(x));
        System.out.println("y = " + Arrays.toString(y));

    }

}
