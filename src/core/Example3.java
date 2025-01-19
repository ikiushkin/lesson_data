package core;

public class Example3 {
    public static void main(String[] args) {
        OuterClass3 outer = new OuterClass3();
        outer.printUsingLocalClass(); // Вывод: Hello from Local Class!
    }
}

class OuterClass3 {
    public void printUsingLocalClass() {
        String localVariable = "Hello from Local Class!";

        // Локальный класс внутри метода
        class LocalClass {
            public void printMessage() {
                System.out.println(localVariable); // Доступ к переменной метода
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.printMessage();
    }
}