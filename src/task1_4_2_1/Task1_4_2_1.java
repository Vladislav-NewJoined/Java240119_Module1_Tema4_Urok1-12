package task1_4_2_1;

public class Task1_4_2_1 {
    public static void main(String[] args) {
        System.out.println("""
            Задание:\s
            Модуль 1. Тема 4. Урок 2. Конструкторы
                Задание 1. Что такое конструктор по-умолчанию?\s

            Решение:\s""");
        System.out.println("Конструктор по умолчанию (default constructor) - это конструктор, который может " +
                "\nбыть вызван без аргументов, или если у класса нет какого-либо конструктора, " +
                "\nпредоставленного программистом, в таких случаях компилятор Java добавит конструктор по умолчанию с " +
                "\nпараметрами out, который вызовет конструктор суперкласса внутренне с помощью вызова super().");

    }
}