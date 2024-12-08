package patterns.behavioral;

// Интерфейс элемента, который принимает посетителя.
interface Element {
    void accept(Visitor visitor); // Метод для принятия посетителя.
}

// Конкретный элемент: книга.
class Book implements Element {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // Вызываем метод "visit" для книги.
    }
}

// Конкретный элемент: фрукт.
class Fruit implements Element {
    private String name;
    private double weight; // Вес в килограммах.
    private double pricePerKg;

    public Fruit(String name, double weight, double pricePerKg) {
        this.name = name;
        this.weight = weight;
        this.pricePerKg = pricePerKg;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // Вызываем метод "visit" для фрукта.
    }
}

// Интерфейс посетителя, который содержит методы для работы с различными элементами.
interface Visitor {
    void visit(Book book);  // Метод для обработки книги.
    void visit(Fruit fruit); // Метод для обработки фрукта.
}

// Конкретный посетитель: подсчёт стоимости корзины.
class ShoppingCartVisitor implements Visitor {
    private double totalCost = 0; // Общая стоимость.

    @Override
    public void visit(Book book) {
        totalCost += book.getPrice(); // Добавляем стоимость книги к общей стоимости.
        System.out.println("Book: " + book.getTitle() + " costs $" + book.getPrice());
    }

    @Override
    public void visit(Fruit fruit) {
        double cost = fruit.getWeight() * fruit.getPricePerKg(); // Считаем стоимость фрукта.
        totalCost += cost;
        System.out.println("Fruit: " + fruit.getName() + " costs $" + cost);
    }

    public double getTotalCost() {
        return totalCost; // Возвращаем общую стоимость.
    }
}

// Клиентский код.
class VisitorMain {
    public static void main(String[] args) {
        // Создаём элементы (книги и фрукты).
        Element book1 = new Book("Design Patterns", 50);
        Element book2 = new Book("Effective Java", 40);
        Element apple = new Fruit("Apple", 2, 3); // 2 кг по $3 за кг.
        Element orange = new Fruit("Orange", 1.5, 2.5); // 1.5 кг по $2.5 за кг.

        // Создаём посетителя для подсчёта стоимости.
        ShoppingCartVisitor visitor = new ShoppingCartVisitor();

        // Каждый элемент принимает посетителя.
        book1.accept(visitor);
        book2.accept(visitor);
        apple.accept(visitor);
        orange.accept(visitor);

        // Выводим общую стоимость.
        System.out.println("Total cost: $" + visitor.getTotalCost());
    }
} // Каждый элемент принимает