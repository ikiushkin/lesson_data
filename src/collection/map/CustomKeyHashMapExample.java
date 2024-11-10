package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CustomKeyHashMapExample {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();

        Person p1 = new Person("Иван", 25);
        Person p2 = new Person("Мария", 30);
        Person p3 = new Person("Иван", 25);

        map.put(p1, "Программист");
        map.put(p2, "Дизайнер");

        // Получение значения по ключу
        String profession = map.get(p3);
        System.out.println("Профессия: " + profession);
    }
}

class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Переопределение hashCode() и equals()
    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return this.age == person.age && Objects.equals(this.name, person.name);
    }
}
