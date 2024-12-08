package patterns.structure;

// Базовый интерфейс: определяет общую функциональность для всех компонентов.
interface Coffee {
    String getDescription(); // Описание кофе.
    double getCost();        // Стоимость кофе.
}

// Конкретный компонент: базовая реализация кофе.
class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee"; // Простое описание.
    }

    @Override
    public double getCost() {
        return 5.0; // Базовая стоимость кофе.
    }
}

// Абстрактный декоратор: базовый класс для всех добавок.
abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee; // Ссылка на декорируемый объект.

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee; // Инициализация декорируемого объекта.
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription(); // Делегируем вызов базового метода.
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost(); // Делегируем вызов базового метода.
    }
}

// Конкретный декоратор: добавляет молоко.
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee); // Передаем декорируемый объект в базовый декоратор.
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Milk"; // Добавляем описание.
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 1.5; // Увеличиваем стоимость.
    }
}

// Конкретный декоратор: добавляет сахар.
class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee); // Передаем декорируемый объект в базовый декоратор.
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Sugar"; // Добавляем описание.
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.5; // Увеличиваем стоимость.
    }
}

// Конкретный декоратор: добавляет карамель.
class CaramelDecorator extends CoffeeDecorator {
    public CaramelDecorator(Coffee coffee) {
        super(coffee); // Передаем декорируемый объект в базовый декоратор.
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Caramel"; // Добавляем описание.
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 2.0; // Увеличиваем стоимость.
    }
}

// Клиентский код: использует декораторы для создания сложного объекта.
class DecoratorMain {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee(); // Базовый кофе.
        System.out.println(coffee.getDescription() + " - $" + coffee.getCost());

        // Добавляем молоко.
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " - $" + coffee.getCost());

        // Добавляем сахар.
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " - $" + coffee.getCost());

        // Добавляем карамель.
        coffee = new CaramelDecorator(coffee);
        System.out.println(coffee.getDescription() + " - $" + coffee.getCost());
    }
}