package task1_4_2_5;

// источник: https://youtu.be/3-zRrEv8cpY
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


//// ПРИМЕР 11
//// источник: https://youtu.be/3-zRrEv8cpY
//public class Task1_4_2_5 {
//    public static void main(String[] args) {
//        System.out.println("""
//                Задание: \s
//                Модуль 1. Тема 4. Урок 2. Конструкторы
//                    Задание 4. Сделайте класс StringBuilder, и несколько конструкторов для него;
//                    продемонстрируйте использование\s
//
//                Решение:\s""");
//
//        StringBuilder sB = new StringBuilder();
//        StringBuilder wS2 = new StringBuilder("Википедия", "https://ru.wikipedia.org");
//        System.out.println("Имя WebSit'а: " + wS2.testString +
//                ", ссылка: " + wS2.testStringNum);
//        StringBuilder wS3 = new StringBuilder("Википедия", "https://ru.wikipedia.org", "описание");
//        System.out.println("Имя WebSit'а: " + wS3.testString +
//                ", ссылка: " + wS3.testStringNum + ", " + wS3.someText + ": Многоязычная универсальная интернет-энциклопедия " +
//                "со свободным контентом");
//    }
//}
//
//class StringBuilder {
//    public String testString;
//    public String testStringNum;
//    public String someText;
//
//    public StringBuilder() {
//        System.out.println("Имя WebSit'а: Википедия");
//    }
//
//    public StringBuilder(String sB, String l) {
//        testString = sB;
//        testStringNum = l;
//    }
//
//    public StringBuilder(String sB, String l, String d) {
//        testString = sB;
//        testStringNum = l;
//        someText = d;
//    }
//}
//// КОНЕЦ ПРИМЕРА 11


//// ПРИМЕР 10
//// источник: https://youtu.be/6jc-E52hIks
//public class Task1_4_2_2 {
//    public static void main(String[] args) {
//        Person vitya = new Person(120, "Vitya");
//        vitya.say("George");
//        System.out.println(vitya.name + "'s height is " + vitya.height);
//        Person vlad = new Person();
//        System.out.println(vlad.height);
//        Person dima = new Person("Dima");
//        System.out.println(dima.name);
//    }
//}
//
//class Person {
//    public int height = 180;
//    public String name = "Default";
//
//    public void say (String name) {
//        System.out.println("Hello, " + name);
//    }
//
//    public Person() {}
//
//    public Person(int h, String n) {
//        height = h;
//        name = n;
//    }
//
//    public Person(String n) {
//        name = n;
//    }
//}
//// КОНЕЦ ПРИМЕРА 10


//// ПРИМЕР 9
//// источник: https://youtu.be/3-zRrEv8cpY
//public class Task1_4_2_2 {
//    public static void main(String[] args) {
//        new Animal();
//        new Animal("Барсик", 5);
//    }
//}
//
//class Animal {
//
//    public Animal() {
//        System.out.println("Выведен в консоль текст из класса SubClass1");
//    }
//
//    public Animal(String name, int age) {
//        System.out.println(name + ", " + age);
//
//    }
//}
//// КОНЕЦ ПРИМЕРА 9


//// ПРИМЕР 8
//// источник: https://youtu.be/3-zRrEv8cpY
//public class Task1_4_2_2 {
//    public static void main(String[] args) {
//        /*Animal cat = */new Animal();
//        /*Animal cat2 = */new Animal("Барсик", 5);
////        System.out.println(cat2.getName());
////        System.out.println(cat2.getAge());
//    }
//}
//
//class Animal {
////    private String name;
////    private int age;
//
//    public Animal() {
//        System.out.println("Выведен в консоль текст из класса SubClass1");
//    }
//
//
//    public Animal(String name, int age) {
////        this.name = name;
////        this.age = age;
//        System.out.println(name + ", " + age);
//
//    }
//
////    public String getName() {
////        return name;
////    }
////
////    public int getAge() {
////        return age;
////    }
//}
//// КОНЕЦ ПРИМЕРА 8


//// ПРИМЕР 7
//public class Task1_4_2_2 {
//    public static void main(String[] args) {
//        Animal cat = new Animal();
//        Animal cat2 = new Animal("Барсик", 5);
//        System.out.println(cat2.getName());
//        System.out.println(cat2.getAge());
//    }
//}
//
//class Animal {
//    private String name;
//    private int age;
//
//    public Animal() {
//        System.out.println("Выведен в консоль текст из класса SubClass1");
//    }
//
//
//    public Animal(String name, int age) {
//        this.name = name;
//        this.age = age;
//
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//}
//// КОНЕЦ ПРИМЕРА 7


//// ПРИМЕР 6
//public class Task1_4_2_2 {
//    public static void main(String[] args) {
//        new Cat();
//    }
//}
//
//class Cat {
//
//    String name;
//    int age;
//
//    //для домашних котов
//    public Cat(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    //для уличных котов
//    public Cat() {
//    }
//
//    public static void main(String[] args) {
//
//        Cat barsik = new Cat("Barsik", 5);
//        System.out.println(barsik);
//        Cat streetCat = new Cat();
//        System.out.println(streetCat);
//    }
//}
//// КОНЕЦ ПРИМЕРА 6


//// ПРИМЕР 5
// источник: https://ru.hexlet.io/qna/java/questions/kak-ispolzovat-metod-iz-drugogo-klassa-java?ysclid=lriys3yarr14846829
//public class Task1_4_2_2 {
//    public static void main(String[] args) {
//        // Создаем объект класса
//        Greetings greetings = new Greetings();
//        // Вызываем метод
//        greetings.printHello(); // => Hello
//        // Вызываем статический метод
//        Greetings.printHexlet(); // => Hexlet
//    }
//}
//
//class Greetings {
//
//    public void printHello() {
//        System.out.println("Hello");
//    }
//
//    public static void printHexlet() {
//        System.out.println("Hexlet");
//    }
//}
//// КОНЕЦ ПРИМЕРА 5


//// ПРИМЕР 4
// +java как вызвать метод из другого класса
//public class Task1_4_2_2 {
//    public static void main(String[] args) {
//        PrintSomeText ps = new PrintSomeText();
//        ps.printSome(); // => Some text printed!
//
//        PrintSomeText ps2 = new PrintSomeText();
//        ps2.printSomeAnother(); // => Some ANOTHER text printed!
//
//
//
//    }
//}
//
//class PrintSomeText {
//    public void printSome() {
//        System.out.println("Some text printed!");
//    }
//
//    public void printSomeAnother() {
//        System.out.println("Some ANOTHER text printed!");
//    }
//}
//// КОНЕЦ ПРИМЕРА 4


//// ПРИМЕР 3
//public class Burger {
//    //INGREDIENTS:
//    private String bun;
//    private String meat;
//    private String meatAdditional;
//    private String cheese;
//    private String greens;
//    private String mayonnaise;
//
//    //CLASSIC BURGER RECIPE:
//    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
//        this.bun = bun;
//        this.meat = meat;
//        this.cheese = cheese;
//        this.greens = greens;
//        this.mayonnaise = mayonnaise;
//
//        System.out.println("Classic burger recipe: " + this.bun + "+" +  this.meat + "+"
//                + this.cheese + "+" + this.greens + "+" + this.mayonnaise);
//    }
//
//    public Burger() {
//
//    }
//
//    public static void main(String[] args) {
//        Burger burger = new Burger();
//    }
//}
//// КОНЕЦ ПРИМЕРА 3


//// ПРИМЕР 2
//public class Task1_4_2_2 {
//    public static void main(String[] args) {
//        System.out.println("""
//            Задание:\s
//            Модуль 1. Тема 4. Урок 2. Конструкторы
//                Задание 2. Как сделать так, чтобы при каждом создании экземпляра класса, в консоль что-то выводилось?
//                (Слежка за классом :))\s
//
//            Решение:\s""");
////        System.out.println("");
//
//        {
//            SubClass1 sub1 = new SubClass1();
//
//            sub1();
//        }
//    }
//
//    private static void sub1() {
//    }
//}
//
//class SubClass1 {
//    public SubClass1()
//    {
////        super();   // calls the superclass constructor
//        System.out.println("This is the subclass constructor.");
//    }
//}
//// КОНЕЦ ПРИМЕРА 2


