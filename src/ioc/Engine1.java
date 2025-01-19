package ioc;

// 1. Inversion of Control (IoC)
// 1.1 Реализация без IoC
class Engine1 {
    void start() {
        System.out.println("Engine started");
    }
}

class Car1 {
    private final Engine1 engine;

    public Car1() {
        this.engine = new Engine1(); // Жесткая связанность: Car напрямую создает Engine
    }

    void drive() {
        engine.start();
        System.out.println("Car is driving");
    }
}

class Main1 {
    public static void main(String[] args) {
        Car1 car = new Car1();
        car.drive();
    }
}