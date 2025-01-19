package oop;

// 4. Полиморфизм
class Calculator {
    // Перегрузка метода add для целых чисел
    int add(int a, int b) {
        return a + b;
    }

    // Перегрузка метода add для вещественных чисел
    double add(double a, double b) {
        return a + b;
    }
}

class Main4 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));       // Вывод: 5
        System.out.println(calc.add(2.5, 3.5));  // Вывод: 6.0
    }
}