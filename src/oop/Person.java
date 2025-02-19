package oop;

// 3. Инкапсуляция
class Person {
    private String name;  // Приватное поле

    // Геттер для name
    public String getName() {
        return name;
    }

    // Сеттер для name
    public void setName(String name) {
        this.name = name;
    }
}

class Main3 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alice");  // Устанавливаем значение через сеттер
        System.out.println(person.getName());  // Читаем значение через геттер
    }
}