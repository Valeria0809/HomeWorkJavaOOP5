package Data.service;

import Data.models.Student;
import Data.models.User;
import Data.models.Teacher;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService {
    List<User> teacherList = new ArrayList<>();
    List<User> studentsList = new ArrayList<>();

    @Override
    public Teacher create(int id, String name, String dateBirth, String disciplineName, String competence) {
        Teacher teacher = new Teacher(id, name, dateBirth, disciplineName, competence);
        teacherList.add(teacher);
        return teacher;
    }

    @Override
    public Student create(int id, String name, String dateBirth, String nameGroup, int course) {
        Student student = new Student(id, name, dateBirth, nameGroup, course);
        studentsList.add(student);
        return student;
    }
    @Override
    public String toSend(String text) {
        return text;
    }
    @Override
    public List<User> readTeachers() {
        return teacherList;
    }

    @Override
    public List<User> readStudents() {
        return studentsList;
    }
}
