package task1_4_2_2;

public class Task1_4_2_2 {
    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                Модуль 1. Тема 4. Урок 2. Конструкторы
                    Задание 2. Как сделать так, чтобы при каждом создании экземпляра класса, в консоль что-то выводилось?
                    (Слежка за классом :))\s

                Решение:\s""");

        new SubClass();
        new SubClass("SubClass", 2);
        new SubClass("Выведен в консоль текст из конструктора ",
                "SubClass", 3);
    }
}

class SubClass {

    public SubClass() {
        System.out.println("Выведен в консоль текст из конструктора SubClass №1");
    }

    public SubClass(String nameOfConstructor, int numOfConstructor) {
        System.out.println("Выведен в консоль текст из конструктора " + nameOfConstructor
                + " №" + numOfConstructor);
    }

    public SubClass(String someText, String nameOfConstructor, int numOfConstructor) {
        System.out.println(someText + nameOfConstructor + " №" + numOfConstructor);
    }
}