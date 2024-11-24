package func;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {

    public static void main(String[] args) {
        functionalInterfaces();

        // Обычный способ
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Привет, мир!");
            }
        };

        // Лямбда-выражение: (параметры) -> { тело }
        Runnable lambdaTask = () -> System.out.println("Привет, мир!");

//        name -> System.out.println("Привет, " + name);

//        (a, b) -> a + b;

//        (x, y) -> {
//            int sum = x + y;
//            return sum * 2;
//        };

        // Обычная лямбда
        Consumer<String> print1 = x -> System.out.println(x);

        // Ссылка на метод
        Consumer<String> print2 = System.out::println;
        print2.accept("Привет!"); // Привет!

        // Ссылка на конструктор
        Supplier<List<String>> listSupplier = ArrayList::new;
        List<String> list = listSupplier.get();
    }

    public static void functionalInterfaces() {
        System.out.println("=== Функциональные интерфейсы ===");

        // Predicate (проверяет условие)
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println("4 четное число?: " + isEven.test(4));

        // Function (преобразует один тип в другой)
        Function<String, Integer> stringLength = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        System.out.println("Длина строки 'Java': " + stringLength.apply("Java"));

        // Consumer (выполняет операцию)
        Consumer<String> printer = System.out::println;
        printer.accept("Это пример Consumer!");

        // Supplier (поставляет значение)
        Supplier<Double> randomValue = Math::random;
        System.out.println("Случайное значение: " + randomValue.get());

        // BiFunction (два аргумента, один результат)
        BiFunction<Integer, Integer, Integer> sum = Integer::sum;
        System.out.println("Сумма 5 и 10: " + sum.apply(5, 10));
    }
}

