package core;

public class StringPoolExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        String str5 = str4.intern(); // теперь str5 ссылается на строку из пула

        System.out.println(str1 == str5); // true

        // Сравнение через оператор ==
        System.out.println(str1 == str2); // true, так как строки из пула строк
        System.out.println(str1 == str3); // false, так как str3 создан через new

        // Сравнение через метод equals()
        System.out.println(str1.equals(str3)); // true, содержимое строк одинаково
        System.out.println(str3 == str4); // false, разные объекты в heap

        StringBuilder sb = new StringBuilder("Hello");

        // Добавление строки
        sb.append(" World");
        System.out.println("После добавления: " + sb); // "Hello World"

        // Вставка строки
        sb.insert(5, ",");
        System.out.println("После вставки: " + sb); // "Hello, World"

        // Замена подстроки
        sb.replace(7, 12, "Java");
        System.out.println("После замены: " + sb); // "Hello, Java"

        // Удаление символов
        sb.delete(5, 6);
        System.out.println("После удаления: " + sb); // "Hello Java"

        // Обратный порядок символов
        sb.reverse();
        System.out.println("После переворота: " + sb); // "avaJ olleH"


    }
}