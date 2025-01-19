package ioc;

// 1. Inversion of Control (IoC)
// 1.2 Реализация с IoC
class Engine2 {
    void start() {
        System.out.println("Engine started");
    }
}

class Car2 {
    private final Engine2 engine;

    // Зависимость передается через конструктор
    public Car2(Engine2 engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();
        System.out.println("Car is driving");
    }
}

class Main2 {
    public static void main(String[] args) {
        Engine2 engine = new Engine2(); // Создаем зависимость
        Car2 car = new Car2(engine);   // Передаем зависимость в Car
        car.drive();
    }
}