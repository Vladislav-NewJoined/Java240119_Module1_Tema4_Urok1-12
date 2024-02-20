package task1_4_2_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class Task1_4_2_6 {
    static String originalDate;
    static String originalStrText = "https://cbr.ru/scripts/XML_dynamic.asp?date_req1=12/11/2021&date_req2=12/11/2021&VAL_NM_RQ=R01235";
    static String str1 = originalStrText;

    public static void main(String[] args) throws IOException, ParseException {
        System.out.println("""
                Задание: \s
                Модуль 1. Тема 4. Урок 2. Конструкторы
                    Задание 6. Сделайте класс Url(ссылка) с несколькими конструкторами; сделайте
                    класс CurrencyCourse (курс валют) с несколькими конструкторами; внутри конструктора
                    CurrencyCourse вызывайте также конструктор Url - инициализируйте ссылку, по которой
                    будете получать курс валют; запросите курс валют.\s

                Решение:\s""");

        BufferedReader buffered = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите в следующей строке исходную дату с разделителем '/' " +
                "и нажмите Enter, пример: 14/02/2020");
        originalDate = buffered.readLine();

        try {
            new Url();
            String urlText2;
            urlText2 = "\nОсуществляем поиск курса USD за введённую дату.";
            System.out.println(urlText2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            new Url(0);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            new CurrencyCourse();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            new CurrencyCourse(0);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Url {
    static String str1 = Task1_4_2_6.str1;

    Url() throws InterruptedException {
    }

    Url(int i) throws InterruptedException {
        str1 = "https://cbr.ru/scripts/XML_dynamic.asp?date_req1=12/11/2021&date_req2=12/11/2021&VAL_NM_RQ=R01235";
        System.out.println("Ссылка, откуда мы берём курс USD: \n" + str1 + "\n");
    }
}

class CurrencyCourse extends Url {
    CurrencyCourse() throws InterruptedException, IOException, ParseException {
        String originalDate = Task1_4_2_6.originalDate;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(originalDate));
        c.add(Calendar.DATE, -1);
        c.add(Calendar.DATE, 2);

        // Задаём адрес исходной веб-страницы Центробанка в текстовом формате.
        String originalStrText = Task1_4_2_6.originalStrText;
        // Меняем в адресе исходной страницы даты на введённые (в трех строках).
        String urlWithDate1 = originalStrText.replaceAll("12/11/2021", originalDate);

        String page1 = downloadWebPage(urlWithDate1);

        // Задаём курсы с типом переменной double.
        double courseDouble1 = 0;

        if (page1.contains("<Value>")) {
            int startIndex1 = page1.lastIndexOf("<Value>");
            int endIndex1 = page1.lastIndexOf("</Value>");
            String courseStr1 = page1.substring(startIndex1 + 7, endIndex1);
            double course1 = Double.parseDouble(courseStr1.replace(",", "."));
            courseDouble1 = course1;
        }

        String noCurse = "На указанную дату курс отсутствует";
        if (courseDouble1 == 0) {
            System.out.println("Курс на " + originalDate + ": " + noCurse);
        } else {
            System.out.println("Курс на " + originalDate + ": " + courseDouble1);
        }
    }

    private static String downloadWebPage(String url) throws IOException {
        java.lang.StringBuilder result = new java.lang.StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();
        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            while ((line = br.readLine()) != null) {
                result.append(line);
            }
        }
        return result.toString();
    }

    CurrencyCourse(int i) throws InterruptedException, IOException, ParseException {
        String originalDate = Task1_4_2_6.originalDate;  // Start date

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar c = Calendar.getInstance();
            c.setTime(sdf.parse(originalDate));
            c.add(Calendar.DATE, -1);  // number of days to add
        String oneDayBeforeDate;
        oneDayBeforeDate = sdf.format(c.getTime());  // entering oneDayBeforeDate
            c.add(Calendar.DATE, 2);  // number of days to add
        String oneDayAfterDate;
        oneDayAfterDate = sdf.format(c.getTime());  // entering oneDayAfterDate

        // Задаём адрес исходной веб-страницы Центробанка в текстовом формате.
        String originalStrText = Task1_4_2_6.originalStrText;
        // Меняем в адресе исходной страницы даты на введённые (в трех строках).
        String urlWithDate1 = originalStrText.replaceAll("12/11/2021", originalDate);
        String urlWithDate2 = originalStrText.replaceAll("12/11/2021", oneDayBeforeDate);
        String urlWithDate3 = originalStrText.replaceAll("12/11/2021", oneDayAfterDate);

        String page1 = downloadWebPage2(urlWithDate1);
        String page2 = downloadWebPage2(urlWithDate2);
        String page3 = downloadWebPage2(urlWithDate3);

        // Задаём курсы с типом переменной double.
        double courseDouble1 = 0;
        double courseDouble2 = 0;
        double courseDouble3 = 0;

        if (page1.contains("<Value>")) {
        int startIndex1 = page1.lastIndexOf("<Value>");
        int endIndex1 = page1.lastIndexOf("</Value>");
        String courseStr1 = page1.substring(startIndex1 + 7, endIndex1);
        double course1 = Double.parseDouble(courseStr1.replace(",", "."));
        courseDouble1 = course1;
    }
        if (page2.contains("<Value>")) {
        int startIndex2 = page2.lastIndexOf("<Value>");
        int endIndex2 = page2.lastIndexOf("</Value>");
        String courseStr2 = page2.substring(startIndex2 + 7, endIndex2);
        double course2 = Double.parseDouble(courseStr2.replace(",", "."));
        courseDouble2 = course2;
    }
        if (page3.contains("<Value>")) {
        int startIndex3 = page3.lastIndexOf("<Value>");
        int endIndex3 = page3.lastIndexOf("</Value>");
        String courseStr3 = page3.substring(startIndex3 + 7, endIndex3);
        double course3 = Double.parseDouble(courseStr3.replace(",", "."));
        courseDouble3 = course3;
    }
        System.out.println();

    String noCurse = "На указанную дату курс отсутствует";
        if (courseDouble1 == 0) {
        System.out.println("В качестве минимальной аналитики добавляем курсы за соседние даты.");
        System.out.println("Курс на " + originalDate + ": " + noCurse);
    } else {
        System.out.println("Добавляем аналитику, т.е. сравниваем с курсами соседних дат.");
        System.out.println("Курс на " + originalDate + ": " + courseDouble1);
    }

        if (courseDouble2 == 0) {
        System.out.println("Курс на " + oneDayBeforeDate + ": " + noCurse);
    } else {
        System.out.println("Курс на " + oneDayBeforeDate + ": " + courseDouble2);
    }

        if (courseDouble3 == 0) {
        System.out.println("Курс на " + oneDayAfterDate + ": " + noCurse);
    } else {
        System.out.println("Курс на " + oneDayAfterDate + ": " + courseDouble3);
    }
        System.out.println();

        if (courseDouble1 == 0 || courseDouble2 == 0 || courseDouble3 == 0) {
        System.out.println("Имеются даты с отсутствующим курсом. Повторите программу и введите другую дату.");
    } else {
        if (courseDouble3 > courseDouble2) {
            System.out.print("Курс вырос на ");
            System.out.println(courseDouble3 - courseDouble2 + "\n");
        } else {
            if (courseDouble3 < courseDouble2) {
                System.out.print("Курс снизился на ");
                System.out.println(courseDouble2 - courseDouble3 + "\n");
            }
        }
        boolean courseDouble1Max = courseDouble1 > courseDouble2 && courseDouble1 > courseDouble3;
        boolean courseDouble2Max = courseDouble2 > courseDouble1 && courseDouble2 > courseDouble3;
        if (courseDouble1Max) {
            System.out.println("Максимальный курс: " + courseDouble1 + "; " + "Приходится на дату: " + originalDate);
        } else {
            if (courseDouble2Max) {
                System.out.println("Максимальный курс: " + courseDouble2 + "; " + "Приходится на дату: " + oneDayBeforeDate);
            } else {
                System.out.println("Максимальный курс: " + courseDouble3 + "; " + "Приходится на дату: " + oneDayAfterDate);
            }
        }
        boolean courseDouble1Min = courseDouble1 < courseDouble2 && courseDouble1 < courseDouble3;
        boolean courseDouble2Min = courseDouble2 < courseDouble1 && courseDouble2 < courseDouble3;
        if (courseDouble1Min) {
            System.out.println("Минимальный курс: " + courseDouble1 + "; " + "Приходится на дату: " + originalDate);
        } else {
            if (courseDouble2Min) {
                System.out.println("Минимальный курс: " + courseDouble2 + "; " + "Приходится на дату: " + oneDayBeforeDate);
            } else {
                System.out.println("Минимальный курс: " + courseDouble3 + "; " + "Приходится на дату: " + oneDayAfterDate);
            }
        }
    }
}

    private static String downloadWebPage2(String url) throws IOException {
        java.lang.StringBuilder result = new java.lang.StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();
        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            while ((line = br.readLine()) != null) {
                result.append(line);
            }
        }
        return result.toString();
    }
}