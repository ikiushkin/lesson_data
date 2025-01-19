package core;

public class Example2 {
    public static void main(String[] args) {
        // Для создания объекта статического вложенного класса не нужно создавать объект внешнего класса
        OuterClass2.StaticNestedClass nested = new OuterClass2.StaticNestedClass();
        nested.printMessage(); // Вывод: Hello from Static OuterClass!
    }
}

class OuterClass2 {
    private static String staticMessage = "Hello from Static OuterClass!";

    // Статический вложенный класс
    static class StaticNestedClass {
        public void printMessage() {
            // Статический вложенный класс имеет доступ только к статическим полям внешнего класса
            System.out.println(staticMessage);
        }
    }
}