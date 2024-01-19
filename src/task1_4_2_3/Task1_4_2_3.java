package task1_4_2_3;

public class Task1_4_2_3 {
    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                Модуль 1. Тема 4. Урок 2. Конструкторы
                    Задание 3. Сделайте класс, отображающий операционную систему; сделайте конструктор
                    для него. Создайте несколько экземпляров\s

                Решение:\s""");

        OperatingSystem oS = new OperatingSystem();
        OperatingSystem oS2 = new OperatingSystem("Windows 10 pro", 64);
        System.out.println("Операционная система: " + oS2.operatingSystem +
                ", разрядность: " + oS2.bitDepth + " бит");
        OperatingSystem oS3 = new OperatingSystem("Процессор: Intel(R) Core(TM)2 Duo CPU, " +
                "Операционная система: ", "Windows 10 pro", 64);
        System.out.println(oS3.someText + oS3.operatingSystem +
                ", разрядность: " + oS3.bitDepth + " бит");
    }
}

class OperatingSystem {
    public String operatingSystem;
    public String someText;
    public int bitDepth;

    public OperatingSystem() {
        System.out.println("Операционная система: Windows 10 pro");
    }

    public OperatingSystem(String oS, int bD) {
        operatingSystem = oS;
        bitDepth = bD;
    }

    public OperatingSystem(String sT, String oS, int bD) {
        operatingSystem = oS;
        bitDepth = bD;
        someText = sT;
    }
}