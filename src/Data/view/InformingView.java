package Data.view;

import Data.models.User;

import java.util.List;

public class InformingView {

    public void sendInform(String text, List<User> listStudents) {
        for (User users : listStudents) {
            System.out.println("Система оповещения оповестила пользователя "
                    + users.getName() + " о " + text);
        }
    }
    public void sendInforms(String text, List<User>listTeachers){
        for(User users : listTeachers){
            System.out.println("Cистема оповещения оповестила пользователя "
                    + users.getName() + " о " + text);
        }
    }
}