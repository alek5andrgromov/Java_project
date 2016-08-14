package Java_courses_ru.Порядок_операций;

/**
 * Created by rockx5g on 07.08.16.
 */
public class LoopForFigureFree {
       public static void main(String[] arg) {
            int count = 10;

            // Внешний цикл
           for (int i = 0; i < count; i++) {
               for (int k = 0; k < i+1; k++) {
                              // Здесь условие даже немного проще
                   if ( k == i || k == count - i - 1  || k == count - 1 ||  i == count - 1 ) {
                       System.out.print("*");
                   } else {
                       System.out.print(" ");
                   }
               }
               // Переход на следующую строку
              System.out.println();
           }
        }

}
