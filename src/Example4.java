public class Example4 {
    public static void main(String[] args) {
        // Создаем анонимный класс, реализующий интерфейс Greeting
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Class!");
            }
        };

        greeting.sayHello(); // Вывод: Hello from Anonymous Class!
    }
}

@FunctionalInterface
interface Greeting {
    void sayHello();

    default void sayHello1() {
        System.out.println("Hello from Anonymous Class!");
    }

    default void sayHello2() {
        System.out.println("Hello from Anonymous Class!");
    }
}