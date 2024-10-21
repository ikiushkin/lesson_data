public class Example5 {
    public static void main(String[] args) {
        // Использование функционального интерфейса с лямбда-выражением
        MyFunctionalInterface printer = System.out::println;
        printer.printMessage("Hello from Functional Interface!");  // Вывод: Hello from Functional Interface!
    }
}

@FunctionalInterface
interface MyFunctionalInterface {
    void printMessage(String message);  // Единственный абстрактный метод
}