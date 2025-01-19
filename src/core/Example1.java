package core;

class Exapmle1 {
    public static void main(String[] args) {
        OuterClass1 outer = new OuterClass1(); // Создаем объект внешнего класса
        OuterClass1.InnerClass inner = outer.new InnerClass(); // Создаем объект внутреннего класса
        inner.printMessage(); // Вывод: Hello from OuterClass!
    }
}

class OuterClass1 {
    private String message = "Hello from OuterClass!";

    // Нестатический внутренний класс
    class InnerClass {
        public void printMessage() {
            // Внутренний класс имеет доступ к приватным полям внешнего класса
            System.out.println(message);
        }
    }
}

