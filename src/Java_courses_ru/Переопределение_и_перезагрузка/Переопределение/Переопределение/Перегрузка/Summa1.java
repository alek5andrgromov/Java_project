package Java_courses_ru.Переопределение_и_перезагрузка.Переопределение.Переопределение.Перегрузка;

/**
 * Created by rockx5g on 14.08.16.
 */
public class Summa1 {
    public static void main(String[] args) {
      double x1 = summa(1,2);
        double x2 = summa(1,2,3);
        double x3 = summa(1,2,3,4);

        System.out.println("summa = " + x1);
        System.out.println("summa = " + x2);
        System.out.println("summa = " + x3);




    }

    public static double summa(double x1, double x2) {
        return x1 + x2;
    }
    public static double summa(double x1, int x2) {
        return x1 + x2;
    }
    public static double summa(double x1, double x2, double x3) {
        return x1 + x2 + x3;
    }
    public static double summa(double x1, double x2, double x3, double x4) {
        return x1 + x2 + x3 + x4;
    }

}
