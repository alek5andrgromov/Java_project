package Java_courses_ru.Порядок_операций;

/**
 * Created by rockx5g on 07.08.16.
 */
public class LoopForFigureFour {
       public static void main(String[] arg) {
           int count = 10;

           // Внешний цикл
           for (int i = count / 2; i > 0; i--) {
               for (int k = 0; k < count; k++) {
                   // Здесь условие даже немного проще
                   if (k == i || count - i == k) {
                       System.out.print("*");
                   } else {
                       System.out.print(" ");
                   }
               }
               // Переход на следующую строку
               System.out.println();
           }
           for (int l = 0; l < count; l++) {
               for (int m = 0; m < count; m++) {
                   if (l == count - 1) {
                       System.out.print("*");
                   } else {
                       System.out.print(" ");
                   }
               }
               System.out.println();
           }
       }
}
