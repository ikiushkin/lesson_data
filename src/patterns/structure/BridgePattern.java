package patterns.structure;

// Интерфейс реализации: определяет методы для отрисовки.
interface Renderer {
    void renderCircle(float radius); // Метод для рисования круга.
    void renderSquare(float side);  // Метод для рисования квадрата.
}

// Реализация в векторном формате.
class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Rendering Circle as vector with radius " + radius);
    }

    @Override
    public void renderSquare(float side) {
        System.out.println("Rendering Square as vector with side " + side);
    }
}

// Реализация в растровом формате.
class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Rendering Circle as raster with radius " + radius);
    }

    @Override
    public void renderSquare(float side) {
        System.out.println("Rendering Square as raster with side " + side);
    }
}

// Абстракция: базовый класс для всех форм.
abstract class Shape {
    protected Renderer renderer; // Ссылка на реализацию.

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();          // Метод для отрисовки.
    public abstract void resize(float factor); // Метод для изменения размера.
}

// Расширенная абстракция: круг.
class Circle extends Shape {
    private float radius; // Радиус круга.

    public Circle(Renderer renderer, float radius) {
        super(renderer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.renderCircle(radius); // Используем реализацию для отрисовки круга.
    }

    @Override
    public void resize(float factor) {
        radius *= factor; // Изменяем радиус круга.
        System.out.println("Circle resized to radius " + radius);
    }
}

// Расширенная абстракция: квадрат.
class Square extends Shape {
    private float side; // Длина стороны квадрата.

    public Square(Renderer renderer, float side) {
        super(renderer);
        this.side = side;
    }

    @Override
    public void draw() {
        renderer.renderSquare(side); // Используем реализацию для отрисовки квадрата.
    }

    @Override
    public void resize(float factor) {
        side *= factor; // Изменяем длину стороны квадрата.
        System.out.println("Square resized to side " + side);
    }
}

// Клиентский код: работает с абстракциями, не завися от реализации.
class BridgeMain {
    public static void main(String[] args) {
        // Создаем векторный рендерер и рисуем круг.
        Renderer vectorRenderer = new VectorRenderer();
        Shape circle = new Circle(vectorRenderer, 5);
        circle.draw();
        circle.resize(2); // Увеличиваем радиус круга.
        circle.draw();

        System.out.println("---");

        // Создаем растровый рендерер и рисуем квадрат.
        Renderer rasterRenderer = new RasterRenderer();
        Shape square = new Square(rasterRenderer, 4);
        square.draw();
        square.resize(0.5f); // Уменьшаем сторону квадрата.
        square.draw();
    }
}