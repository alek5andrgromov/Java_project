package Java_courses_ru.Переопределение_и_перезагрузка.Переопределение.Переопределение.Переопределение;

/**
 * Created by rockx5g on 14.08.16.
 */
public class Robot {
    private  String name;

    public  Robot(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "name=" + name;
    }
}
