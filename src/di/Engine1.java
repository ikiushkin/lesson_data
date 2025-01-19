package di;

// 2. Dependency Injection (DI)
// 2.1 Constructor Injection
class Engine1 {
    void start() {
        System.out.println("Engine started");
    }
}

class Car1 {
    private final Engine1 engine;

    // Конструктор принимает зависимость
    public Car1(Engine1 engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();
        System.out.println("Car is driving");
    }
}

class Main1 {
    public static void main(String[] args) {
        Engine1 engine = new Engine1(); // Создаем объект Engine
        Car1 car = new Car1(engine);   // Внедряем зависимость через конструктор
        car.drive();
    }
}