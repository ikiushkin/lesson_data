package di;

// 2. Dependency Injection (DI)
// 2.2 Setter Injection
class Engine2 {
    void start() {
        System.out.println("Engine started");
    }
}

class Car2 {
    private Engine2 engine;

    // Сеттер для зависимости
    public void setEngine(Engine2 engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();
        System.out.println("Car is driving");
    }
}

class Main2 {
    public static void main(String[] args) {
        Engine2 engine = new Engine2(); // Создаем объект Engine
        Car2 car = new Car2();
        car.setEngine(engine);          // Внедряем зависимость через сеттер
        car.drive();
    }
}