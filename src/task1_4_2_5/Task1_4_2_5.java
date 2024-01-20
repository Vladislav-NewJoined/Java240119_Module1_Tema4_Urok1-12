package task1_4_2_5;

public class Task1_4_2_5 {
    public static void main(String[] args) {
        System.out.println("""
                Задание: \s
                Модуль 1. Тема 4. Урок 2. Конструкторы
                    Задание 5. Создайте экземпляры StringBuilder, используя несколько конструкторов\s

                Решение:\s""");

        StringBuilder sB = new StringBuilder();

        StringBuilder sB2 = new StringBuilder("тестовая строка №", 2);
        System.out.println("При помощи StringBuilder создана " + sB2.testString + sB2.testStringNum);

        StringBuilder sB3 = new StringBuilder("При помощи StringBuilder создана ", "тестовая строка №", 3);
        System.out.println(sB3.someText + sB3.testString + sB3.testStringNum);
    }
}

class StringBuilder {

    public String someText;
    public String testString;
    public int testStringNum;

    public StringBuilder() {
        System.out.println("При помощи StringBuilder создана тестовая строка №1");
    }

    public StringBuilder(String tS, int tSN) {
        testString = tS;
        testStringNum = tSN;
    }

    public StringBuilder(String sT, String tS, int tSN) {
        someText = sT;
        testString = tS;
        testStringNum = tSN;
    }
}