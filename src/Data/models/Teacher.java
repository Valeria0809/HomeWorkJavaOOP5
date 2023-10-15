package Data.models;

public class Teacher extends User {
    String disciplineName;
    String competence;

    public Teacher(int id, String name, String dateBirth, String disciplineName, String competence) {
        super(id, name, dateBirth);
        this.disciplineName = disciplineName;
        this.competence = competence;
    }

    @Override
    public String toString() {
        return "Учитель. " +
                "Дисциплина: " + disciplineName +
                ", Компетенция: " + competence +
                ", id: " + id +
                ", Имя: " + name +
                ", Дата рождения: " + dateBirth;
    }
}
