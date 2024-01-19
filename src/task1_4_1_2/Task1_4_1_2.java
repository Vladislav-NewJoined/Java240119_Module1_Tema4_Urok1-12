package task1_4_1_2;

public class Task1_4_1_2 {
    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                Модуль 1. Тема 4. Урок 1. Наследование
                    Задание 2. Реализуйте классы с наследованием: пользователь, администратор, модератор\s

                Решение:\s""");

        Task1_4_1_2_SourceData sourceData = new Task1_4_1_2_SourceData();
        sourceData.user = "Ivan - is user";
        sourceData.administrator = "Vasiliy - is administrator";
        sourceData.printSourceFields();

        Task1_4_1_2_Moderator moderator = new Task1_4_1_2_Moderator();
        moderator.moderator = "Mihail - is moderator";
        moderator.printModerator();
    }
}
