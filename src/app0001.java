/**
 * Created by RockX5G on 28.02.2016.
 */
public class app0001 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print((i + j > 3 ? "+" : "-"));
            }
            System.out.println();
        }
    }
}
