package Data.models;

public class Student extends User {
    String nameGroup;
    int course;

    public Student(Integer id, String name, String dateBirth, String nameGroup, int course) {
        super(id, name, dateBirth);
        this.nameGroup = nameGroup;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Студент. " +
                "Название Группы: " + nameGroup +
                ", Курс: " + course +
                ", id: " + id +
                ", Имя: " + name +
                ", Дата рождения: " + dateBirth;
    }
}