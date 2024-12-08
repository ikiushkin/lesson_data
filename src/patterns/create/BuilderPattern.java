package patterns.create;

class Car {
    private String engine; // Двигатель автомобиля.
    private int wheels;    // Количество колес.

    public static class Builder {
        private String engine;
        private int wheels;

        public Builder setEngine(String engine) { // Установка двигателя.
            this.engine = engine;
            return this; // Возвращаем текущий объект для цепочки вызовов.
        }

        public Builder setWheels(int wheels) { // Установка колес.
            this.wheels = wheels;
            return this;
        }

        public Car build() { // Завершение сборки объекта.
            Car car = new Car();
            car.engine = this.engine; // Передаем параметры в объект Car.
            car.wheels = this.wheels;
            return car; // Возвращаем собранный объект.
        }
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", wheels=" + wheels + "]"; // Возвращаем описание объекта.
    }
}

class BuilderMain {
    public static void main(String[] args) {
        Car car = new Car.Builder()
            .setEngine("V8") // Устанавливаем двигатель.
            .setWheels(4)    // Устанавливаем колеса.
            .build();        // Создаем объект.
        System.out.println(car); // Выводим описание объекта.
    }
}