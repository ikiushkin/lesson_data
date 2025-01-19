package core;

import java.util.HashMap;

public class StringExamples {
    public static void main(String[] args) {
        // Пример 1: Конкатенация строк
        concatStrings();

        // Пример 2: Длина строки
        stringLength();

        // Пример 3: Извлечение символа по индексу
        charAtExample();

        // Пример 4: Сравнение строк
        compareStrings();

        // Пример 5: Извлечение подстроки
        substringExample();

        // Пример 6: Замена подстроки
        replaceExample();

        // Пример 7: Проверка на наличие подстроки
        containsExample();

        // Пример 8: Разбиение строки
        splitExample();

        // Пример 9: Преобразование регистра
        changeCase();

        // Пример 10: Удаление пробелов
        trimExample();

        // Пример 11: Проверка на пустую строку
        checkEmpty();

        // Пример 12: Подсчет количества слов в строке
        countWords();

        // Пример 13: Проверка на палиндром
        checkPalindrome();

        // Пример 14: Подсчет частоты символов
        countCharFrequency();
    }

    // Пример 1: Конкатенация строк
    public static void concatStrings() {
        String s1 = "Hello";
        String s2 = "World";
        String result = s1 + " " + s2;
        System.out.println("Конкатенация: " + result);
    }

    // Пример 2: Длина строки
    public static void stringLength() {
        String s = "Hello";
        int length = s.length();
        System.out.println("Длина строки: " + length);
    }

    // Пример 3: Извлечение символа по индексу
    public static void charAtExample() {
        String s = "Hello";
        char c = s.charAt(1);
        System.out.println("Символ на позиции 1: " + c);
    }

    // Пример 4: Сравнение строк
    public static void compareStrings() {
        String s1 = "hello";
        String s2 = "Hello";
        boolean isEqual = s1.equals(s2);
        boolean isEqualIgnoreCase = s1.equalsIgnoreCase(s2);
        int comparison = s1.compareTo(s2);

        System.out.println("Сравнение строк (equals): " + isEqual);
        System.out.println("Сравнение строк (equalsIgnoreCase): " + isEqualIgnoreCase);
        System.out.println("Сравнение строк (compareTo): " + comparison);
    }

    // Пример 5: Извлечение подстроки
    public static void substringExample() {
        String s = "Hello, world!";
        String sub = s.substring(7);
        String sub2 = s.substring(0, 5);
        System.out.println("Подстрока (с 7): " + sub);
        System.out.println("Подстрока (0-5): " + sub2);
    }

    // Пример 6: Замена подстроки
    public static void replaceExample() {
        String s = "Hello, world!";
        String replaced = s.replace("world", "Java");
        System.out.println("Замена подстроки: " + replaced);
    }

    // Пример 7: Проверка на наличие подстроки
    public static void containsExample() {
        String s = "Hello, world!";
        boolean contains = s.contains("world");
        System.out.println("Содержит 'world': " + contains);
    }

    // Пример 8: Разбиение строки
    public static void splitExample() {
        String s = "apple,orange,banana";
        String[] fruits = s.split(",");
        System.out.println("Разбиение строки:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    // Пример 9: Преобразование регистра
    public static void changeCase() {
        String s = "Hello";
        String upper = s.toUpperCase();
        String lower = s.toLowerCase();
        System.out.println("Верхний регистр: " + upper);
        System.out.println("Нижний регистр: " + lower);
    }

    // Пример 10: Удаление пробелов
    public static void trimExample() {
        String s = "   Hello, world!   ";
        String trimmed = s.trim();
        System.out.println("Удаление пробелов: '" + trimmed + "'");
    }

    // Пример 11: Проверка на пустую строку
    public static void checkEmpty() {
        String s1 = "";
        String s2 = "   ";
        boolean isEmpty = s1.isEmpty();
        boolean isBlank = s2.isBlank(); // Доступно с Java 11
        System.out.println("Пустая строка: " + isEmpty);
        System.out.println("Строка содержит только пробелы: " + isBlank);
    }

    // Пример 12: Подсчет количества слов в строке
    public static void countWords() {
        String sentence = "This is a simple sentence";
        String[] words = sentence.split(" ");
        System.out.println("Количество слов: " + words.length);
    }

    // Пример 13: Проверка на палиндром
    public static void checkPalindrome() {
        String str = "madam";
        boolean isPalindrome = isPalindrome(str);
        System.out.println("Является ли строка палиндромом? " + isPalindrome);
    }

    // Метод для проверки палиндрома
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Пример 14: Подсчет частоты символов
    public static void countCharFrequency() {
        String str = "hello";
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Частота символов: " + charCountMap);

        Cat cat1 = new Cat(1.0, 2.06 ,3.1);
        Cat cat2 = new Cat(2.0, 3.06 ,null);
    }
}