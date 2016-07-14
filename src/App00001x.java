/**
 * Created by RockX5G on 22.03.2016.
 */
public class App00001x {
    public static void main(String[] args) {
        IntHolder x = new IntHolder(0);
        IntHolder y = x;
        x.value =1;
        System.out.println("x.value: " + x.value);
        System.out.println("y.value: " + y.value);
    }


}
