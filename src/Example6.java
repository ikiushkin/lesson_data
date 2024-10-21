import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//•	Predicate<T> — проверяет некоторое условие и возвращает true или false.
//•	Function<T, R> — принимает объект типа T и возвращает объект типа R.
//•	Consumer<T> — принимает объект типа T, но ничего не возвращает.
//•	Supplier<T> — возвращает объект типа T, не принимая никаких аргументов.
//•	UnaryOperator<T> — принимает объект типа T и возвращает объект того же типа.
//•	BinaryOperator<T> — принимает два объекта типа T и возвращает объект того же типа.

public class Example6 {
    public static void main(String[] args) {
        // Predicate проверяет, является ли число больше 10
        Predicate<Integer> isGreaterThanTen = (n) -> n > 10;

        System.out.println(isGreaterThanTen.test(15));  // true
        System.out.println(isGreaterThanTen.test(8));   // false

        // Function преобразует строку в её длину
        Function<String, Integer> stringLength = String::length;

        System.out.println(stringLength.apply("Hello"));  // 5
        System.out.println(stringLength.apply("Java"));   // 4

        // Consumer принимает строку и выводит её на экран
        Consumer<String> printString = (str) -> System.out.println(str);

        printString.accept("Hello from Consumer!");  // Вывод: Hello from Consumer!

        // Supplier возвращает случайное число
        Supplier<Double> randomSupplier = () -> Math.random();

        System.out.println(randomSupplier.get());  // Например: 0.23545
        System.out.println(randomSupplier.get());  // Например: 0.89684

        Runnable task = () -> System.out.println("Task is running...");
        new Thread(task).start();

        Comparator<String> stringComparator = (s1, s2) -> s1.length() - s2.length();
    }
}
