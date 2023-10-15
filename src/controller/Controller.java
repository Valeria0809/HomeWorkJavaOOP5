package controller;

import Data.models.Student;
import Data.models.User;
import Data.models.Teacher;
import Data.service.DataService;
import Data.service.UserService;
import Data.view.InformingView;
import Data.view.UserView;

import java.util.List;

public class Controller {
    DataService dataService;
    UserView userView;
    InformingView informingView;

    public Controller() {
        this.dataService = new UserService();
        this.userView = new UserView();
        this.informingView = new InformingView();
    }

    public void sendRequest(int id, String name, String dateBirth, String disciplineName, String competence) {
        Teacher teacher = dataService.create(id, name, dateBirth, disciplineName, competence);
        userView.showAdded(teacher);
    }

    public void sendRequest(int id, String name, String dateBirth, String nameGroup, int course) {
        Student student = dataService.create(id, name, dateBirth, nameGroup, course);
        userView.showAdded(student);
    }

    public void sendRequest(String text, String group) {
        String resTxt = dataService.toSend(text);
        switch (group) {
            case "Учителя":
                List<User> listTeachers = dataService.readTeachers();
                informingView.sendInforms(resTxt, listTeachers);
                break;
            case "Студенты":
                List<User> listStudents = dataService.readStudents();
                informingView.sendInform(resTxt, listStudents);
                break;
        }
    }

    public void sendRequest() {
        List<User> teacher = dataService.readTeachers();
        List<User> students = dataService.readStudents();
        userView.listUsers(teacher);
        userView.listUsers(students);
    }
}

