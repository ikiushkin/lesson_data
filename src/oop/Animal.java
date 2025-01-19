package oop;

// 2. Наследование
// Родительский класс
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Подкласс
class Dog extends Animal {
    @Override // 4. Полиморфизм
    void eat() {
        System.out.println("This dog eats food.");
    }

    void bark() {
        System.out.println("The dog barks.");
    }
}

class Main2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();   // Наследованный метод
        dog.bark();  // Метод подкласса
    }
}