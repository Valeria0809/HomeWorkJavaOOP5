package Data.view;

import Data.models.User;

import java.util.List;

public class UserView {
    public void showAdded(User user) {
        if (user != null) {
            System.out.println("Пользователь: " + user);
        }
    }

    public void listUsers(List<User> users) {
        if (users.isEmpty()) {
            System.out.println("Список пуст!");
            return;
        }
        System.out.println(users);
    }
}