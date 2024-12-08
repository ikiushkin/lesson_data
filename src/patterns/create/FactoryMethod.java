package patterns.create;

abstract class Shape {
    abstract void draw(); // Абстрактный метод для рисования фигуры.
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle"); // Реализация для круга.
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing Square"); // Реализация для квадрата.
    }
}

class ShapeFactory {
    public static Shape getShape(String type) { // Фабричный метод.
        if (type.equals("circle")) {
            return new Circle(); // Возвращает круг.
        } else if (type.equals("square")) {
            return new Square(); // Возвращает квадрат.
        }
        return null; // Возвращает null, если тип не распознан.
    }
}

class FMMain {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("circle"); // Получаем круг через фабрику.
        shape.draw(); // Рисуем круг.
    }
}