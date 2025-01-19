package core;

public class Example7 {
    public static void main(String[] args) {
        // Создаем объект класса core.Box для хранения строки
        Box<Double> stringBox = new Box<>();
        stringBox.setItem(4.4);
        System.out.println(stringBox.getItem());  // Вывод: Hello, Generics!

        // Создаем объект класса core.Box для хранения числа
        Box<Integer> intBox = new Box<>();
        intBox.setItem(123);
        System.out.println(intBox.getItem());  // Вывод: 123
    }
}

// Обобщённый класс с параметром типа T
class Box<T extends Number> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

//•	T — это параметр типа, который заменяется конкретным типом при создании объекта класса. Например, core.Box<String> или core.Box<Integer>.
//•	Мы можем использовать один и тот же класс core.Box для хранения данных любого типа, не дублируя код.
