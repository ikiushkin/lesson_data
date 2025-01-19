package oop;

// 1. Классы и объекты
// Класс описывает свойства и поведение автомобиля
class Car {
    String brand;   // Поле: бренд автомобиля
    String color;   // Поле: цвет автомобиля

    // Метод: вывести информацию об автомобиле
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Color: " + color);
    }
}

class Main1 {
    public static void main(String[] args) {
        // Создание объекта (экземпляра класса)
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.color = "Red";

        car1.displayInfo();  // Вывод: Brand: Toyota, Color: Red
    }
}