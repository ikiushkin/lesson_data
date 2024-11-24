package func.tri_function;

@FunctionalInterface
interface TriFunction<T, U, V, R> {

    R apply(T t, U u, V v);
}

class CustomFunctionalInterfaceExample {

    public static void main(String[] args) {
        useCustomInterface();
    }

    // Метод, использующий TriFunction
    public static void useCustomInterface() {
        System.out.println("=== Использование собственного функционального интерфейса ===");

        // Реализация TriFunction для сложения трех чисел
        TriFunction<Integer, Integer, Integer, Integer> sumThreeNumbers = (a, b, c) -> a + b + c;

        int result1 = sumThreeNumbers.apply(10, 20, 30);
        System.out.println("Сумма 10, 20 и 30: " + result1);

        // Реализация TriFunction для объединения трех строк
        TriFunction<String, String, String, String> concatenateStrings = (s1, s2, s3) -> s1 + s2 + s3;

        String result2 = concatenateStrings.apply("Java", " is ", "fun!");
        System.out.println("Объединение строк: " + result2);

        // Реализация TriFunction для нахождения среднего значения
        TriFunction<Integer, Integer, Integer, Double> average = (a, b, c) -> (a + b + c) / 3.0;

        double result3 = average.apply(4, 8, 10);
        System.out.println("Среднее значение чисел 4, 8 и 10: " + result3);
    }
}