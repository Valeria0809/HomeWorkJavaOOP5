package Data.service;

import Data.models.Student;
import Data.models.User;
import Data.models.Teacher;

import java.util.List;

public interface DataService {
    Teacher create(int id, String name, String dateBirth, String disciplineName, String competence);

    Student create(int id, String name, String dateBirth, String nameGroup, int course);

    String toSend(String text);

    List<User> readTeachers();

    List<User> readStudents();

}