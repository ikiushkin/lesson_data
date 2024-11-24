package func;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.*;

public class StreamExamples {

    public static void main(String[] args) throws IOException {
        createStreams();
        intermediateOperations();
        terminalOperations();
        combinedExample();

        // Параллельная обработка данных
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        int sum = numbers.parallelStream()
            .filter(x -> x % 2 == 0)
            .mapToInt(x -> x)
            .sum();

        System.out.println(sum); // 12
    }

    // 1. Создание потоков
    public static void createStreams() throws IOException {
        System.out.println("=== Создание потоков ===");

        // Из коллекции
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> streamFromList = numbers.stream();
        System.out.println("Поток из списка: " + streamFromList.collect(Collectors.toList()));

        // Из массива
        Stream<String> streamFromArray = Stream.of("Java", "Stream", "API");
        System.out.println("Поток из массива: " + streamFromArray.toList());

        // Генерация бесконечного потока
        Stream<Double> infiniteStream = Stream.generate(Math::random).limit(5);
        System.out.println("Бесконечный поток случайных чисел: " + infiniteStream.toList());

        // Диапазоны чисел
        IntStream rangeStream = IntStream.range(1, 5); // от 1 до 4 включительно
        System.out.println("Диапазон чисел: " + rangeStream.boxed().toList());

        // Из файла
//        Stream<String> lines = Files.lines(Paths.get("file.txt"));
    }

    // 2. Промежуточные операции
    public static void intermediateOperations() {
        System.out.println("\n=== Промежуточные операции ===");

        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "Alice", "Charlie");

        // filter: Фильтрация элементов
        List<String> filtered = names.stream()
            .filter(name -> name.startsWith("A"))
            .toList();
        System.out.println("Фильтрованные имена: " + filtered);

        // map: Преобразование элементов
        List<String> uppercased = names.stream()
            .map(String::toUpperCase)
            .toList();
        System.out.println("Имена в верхнем регистре: " + uppercased);

        // distinct: Удаление дубликатов
        List<String> uniqueNames = names.stream()
            .distinct()
            .toList();
        System.out.println("Уникальные имена: " + uniqueNames);

        // sorted: Сортировка
        List<String> sortedNames = names.stream()
            .sorted(Comparator.reverseOrder())
            .toList();
        System.out.println("Сортированные имена: " + sortedNames);

        // limit и skip: Ограничение и пропуск
        List<String> limited = names.stream()
            .limit(3)
            .toList();
        System.out.println("Ограниченный поток: " + limited);

        List<String> skipped = names.stream()
            .skip(2)
            .toList();
        System.out.println("Пропущенные первые два: " + skipped);

//        List<Person> persons = List.of(new Person(1, "1", List.of("1")), new Person(2, "2", List.of("2", "3")));
//        List<String> names1 = persons.stream()
//            .flatMap(p -> p.getNames().stream())
//            .toList();
//        System.out.println(names1);
    }

    // 3. Терминальные операции
    public static void terminalOperations() {
        System.out.println("\n=== Терминальные операции ===");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // collect: Сбор элементов в коллекцию
        List<Integer> collected = numbers.stream()
            .filter(n -> n % 2 == 0)
            .toList();
        System.out.println("Четные числа: " + collected);

        // forEach: Итерация по элементам
        System.out.print("Числа: ");
        numbers.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        // reduce: Свертка потока в одно значение
        int sum = numbers.stream()
            .reduce(0, Integer::sum);
        System.out.println("Сумма чисел: " + sum);

        // findFirst: Поиск первого элемента
        Optional<Integer> first = numbers.stream()
            .sorted()
            .findFirst();
        first.ifPresent(n -> System.out.println("Первое число: " + n));

        // anyMatch, allMatch, noneMatch
        boolean anyEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("Есть ли четные числа? " + anyEven);

        boolean allPositive = numbers.stream().allMatch(n -> n > 0);
        System.out.println("Все числа положительные? " + allPositive);
    }

    // 4. Пример с несколькими операторами
    public static void combinedExample() {
        System.out.println("\n=== Пример с несколькими операторами ===");

        List<String> words = Arrays.asList("stream", "api", "java", "lambda", "function");

        // Фильтрация, преобразование, сортировка и сбор в коллекцию
        List<String> processedWords = words.stream()
            .filter(word -> word.length() > 3) // Слова длиной > 3
            .map(String::toUpperCase) // Преобразование в верхний регистр
            .peek(System.out::println)
            .sorted(Comparator.reverseOrder()) // Сортировка
            .toList();
        System.out.println("Обработанные слова: " + processedWords);
    }
}