package task1_4_2_4;

public class Task1_4_2_4 {
    public static void main(String[] args) {
        System.out.println("""
                Задание: \s
                Модуль 1. Тема 4. Урок 2. Конструкторы
                    Задание 4. Сделайте класс WebSite, и несколько конструкторов для него;
                    продемонстрируйте использование\s

                Решение:\s""");

        WebSite wS = new WebSite();
        WebSite wS2 = new WebSite("Википедия", "https://ru.wikipedia.org");
        System.out.println("Имя WebSit'а: " + wS2.webSite +
                ", ссылка: " + wS2.link);
        WebSite wS3 = new WebSite("Википедия", "https://ru.wikipedia.org", "описание");
        System.out.println("Имя WebSit'а: " + wS3.webSite +
                ", ссылка: " + wS3.link + ", " + wS3.description + ": Многоязычная универсальная интернет-энциклопедия " +
                "со свободным контентом");
    }
}

class WebSite {
    public String webSite;
    public String link;
    public String description;

    public WebSite() {
        System.out.println("Имя WebSit'а: Википедия");
    }

    public WebSite(String wS, String l) {
        webSite = wS;
        link = l;
    }

    public WebSite(String wS, String l, String d) {
        webSite = wS;
        link = l;
        description = d;
    }
}