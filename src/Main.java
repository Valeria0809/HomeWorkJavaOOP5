import controller.Controller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте!");
        Controller controller = new Controller();
        controller.sendRequest(1, "Иван Иванович", "30.11.1968", "Высшая математика", "Доктор наук");
        controller.sendRequest(9, "Ольга Сергеевна", "14.06.1975", "Информационные технологии", "Профессор");
        controller.sendRequest(2, "Дмитрий", "04.04.1997", "GB", 2);
        controller.sendRequest(3, "Марина", "18.02.1995", "Skillbox", 1);
        while (flag) {
            System.out.println("Если вы хотите получить список всех пользователей, введите - 1 \n" +
                    "Если хотите сделать рассылку, нажмите - 2 \n" +
                    "Завершить работу - 3");
            int start = scanner.nextInt();
            if (start == 1) {
                controller.sendRequest();
            }
            if (start == 2) {
                System.out.println("Введите текст рассылки: ");
                scanner.nextLine();
                String text = scanner.nextLine();
                System.out.println("Введите категорию оповещаемых(teachers, students): ");
                String group = scanner.nextLine();
                controller.sendRequest(text, group);
            }
            if (start == 3) {
                flag = false;
            }
        }
    }
}