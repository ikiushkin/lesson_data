import java.util.regex.*;

/*
    \\d — любая цифра (0-9).
    \\D — любой символ, кроме цифры.
    \\w — любой символ слова (буквы, цифры, знак подчеркивания).
    \\W — любой символ, кроме букв, цифр и знака подчеркивания.
    \\s — любой пробельный символ (пробел, табуляция, новая строка).
    \\S — любой символ, кроме пробела.
    . — любой символ, кроме символа новой строки.
    ^ — начало строки.
    $ — конец строки.
    [abc] — любой символ из множества: ‘a’, ‘b’ или ‘c’.
    [^abc] — любой символ, кроме ‘a’, ‘b’ или ‘c’.
    a* — 0 или более символов ‘a’.
    a+ — 1 или более символов ‘a’.
    a{2} — ровно 2 символа ‘a’.
    a{2,5} — от 2 до 5 символов ‘a’.
    (abc) — группа символов, соответствующая “abc”.
*/
public class RegexExamples {
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("a*b");
//        Matcher matcher = pattern.matcher("aaab");
//        boolean matches = matcher.matches();
//        System.out.println("Соответствует ли строка шаблону? " + matches);

        // Пример 1: Проверка соответствия строки регулярному выражению
//        matchesExample();

        // Пример 2: Поиск подстрок по шаблону
//        findExample();

        // Пример 3: Замена подстрок
//        replaceExample();

        // Пример 4: Разбиение строки по регулярному выражению
//        splitExample();

        // Пример 5: Использование групп в регулярных выражениях
//        groupExample();

        // Пример 6: Использование флагов (игнорирование регистра)
//        caseInsensitiveExample();

        // Пример 7: Проверка email-адреса
//        emailValidationExample();

        // Пример 8: Поиск всех URL в тексте
//        urlSearchExample();

        // Пример 9: Валидация номера телефона
//        phoneValidationExample();

        int x = 1;
        int y = 6;
        System.out.println(x + " " + (y + x));
    }

    // Пример 1: Проверка соответствия строки регулярному выражению
    public static void matchesExample() {
        String regex = "\\d+"; // Шаблон для одной или более цифр
        String input = "12345";

        boolean matches = input.matches(regex);
        System.out.println("Пример 1: Строка соответствует шаблону: " + matches); // true
    }

    // Пример 2: Поиск подстрок по шаблону
    public static void findExample() {
        String regex = "\\d+"; // Ищем последовательности цифр
        String input = "The price is 100 dollars, and 50 cents.";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        System.out.println("Пример 2: Найдены числа:");
        while (matcher.find()) {
            System.out.println(matcher.group()); // Найдет "100" и "50"
        }
    }

    // Пример 3: Замена подстрок
    public static void replaceExample() {
        String regex = "\\d+"; // Шаблон для цифр
        String input = "I have 2 apples and 10 oranges.";

        String result = input.replaceAll(regex, "#");
        System.out.println("Пример 3: Результат замены: " + result); // "I have # apples and # oranges."
    }

    // Пример 4: Разбиение строки по регулярному выражению
    public static void splitExample() {
        String regex = "\\s+"; // Разделитель - один или более пробелов
        String input = "This        is a\ntest";

        String[] result = input.split(regex);

        System.out.println("Пример 4: Разбиение строки:");
        for (String word : result) {
            System.out.println(word); // Выведет: This, is, a, test
        }
    }

    // Пример 5: Использование групп в регулярных выражениях
    public static void groupExample() {
        String regex = "(\\d{3})-(\\d{2})-(\\d{4})"; // Шаблон для SSN (xxx-xx-xxxx)
        String input = "My SSN is 123-45-6789";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            System.out.println("Пример 5: Полное совпадение: " + matcher.group(0)); // "123-45-6789"
            System.out.println("Первая группа: " + matcher.group(1)); // "123"
            System.out.println("Вторая группа: " + matcher.group(2)); // "45"
            System.out.println("Третья группа: " + matcher.group(3)); // "6789"
        }
    }

    // Пример 6: Использование флагов (игнорирование регистра)
    public static void caseInsensitiveExample() {
        String regex = "hello";
        String input = "Hello World";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); // Игнорировать регистр
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            System.out.println("Пример 6: Найдено (игнорируя регистр): " + matcher.group()); // "Hello"
        }
    }

    // Пример 7: Проверка email-адреса
    public static void emailValidationExample() {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        String email = "exampl+e@example.com";

        boolean isValid = email.matches(regex);
        System.out.println("Пример 7: Email корректен: " + isValid); // true
    }

    // Пример 8: Поиск всех URL в тексте
    public static void urlSearchExample() {
        String regex = "https?://\\S+";
        String text = "Visit our site at https://www.example.com or http://example.org.";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Пример 8: Найденные URL:");
        while (matcher.find()) {
            System.out.println(matcher.group()); // Найдет "https://www.example.com" и "http://example.org"
        }
    }

    // Пример 9: Валидация номера телефона
    public static void phoneValidationExample() {
        String regex = "\\(\\d{3}\\) \\d{3}-\\d{4}";
        String phoneNumber = "(823) 456-7890";

        boolean isValid = phoneNumber.matches(regex);
        System.out.println("Пример 9: Телефон корректен: " + isValid); // true
    }
}
