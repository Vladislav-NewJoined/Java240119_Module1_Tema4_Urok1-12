package task1_4_1_3;

public class Task1_4_1_3 {
    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                Модуль 1. Тема 4. Урок 1. Наследование
                    Задание 3. Реализуйте классы с наследованием: персонаж, главный герой, злодей,
                    друг главного героя\s

                Решение:\s""");

        Task1_4_1_3_Movie movie = new Task1_4_1_3_Movie();
        movie.personage = "The personage, his name is John";
        movie.leadingHero = "The leadingHero, his name is Michael, is the best guy";
        movie.friendOfLeadingHero = "The friendOfLeadingHero, his name is Billy";
        movie.printSourceFields();

        Task1_4_1_3_BadGuy badGuy = new Task1_4_1_3_BadGuy();
        badGuy.badGuy = "The badGuy, his name is Bobby, is the worst guy";
        badGuy.printFieldBadGay();
    }
}
