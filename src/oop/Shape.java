package oop;

// 5. Абстракция
abstract class Shape {
    abstract void draw();  // Абстрактный метод
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Main5 {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();  // Вывод: Drawing a circle
    }
}