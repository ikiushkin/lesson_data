package collection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(4);
        numbers.add(2);
        numbers.add(6);
        numbers.add(1);
        numbers.add(3);

        System.out.println("TreeSet: " + numbers);

//        TreeSet<Person> people = new TreeSet<>(new PersonComparator());
//        TreeSet<Person> people = new TreeSet<>(Comparator.comparing(Person::age).thenComparing(Person::name).reversed());
//
//        // Добавляем объекты Person
//        people.add(new Person("Алексей", 30, "+7-900-123-45-67"));
//        people.add(new Person("Мария", 25, "+7-900-234-56-78"));
//        people.add(new Person("Иван", 30, "+7-900-345-67-89"));
//        people.add(new Person("Сергей", 22, "+7-911-422-71-35"));
//        people.add(new Person("Анна", 22, "+7-900-456-78-90"));
//        people.add(new Person("Борис", 25, "+7-900-567-89-01"));
//
//        // Выводим содержимое TreeSet
//        people.forEach(System.out::println);
    }
}

record Person(String name, int age, String phone) {
    // Переопределение метода toString() для удобного вывода информации об объекте
    @Override
    public String toString() {
        return name + " (" + age + ") - " + phone;
    }
}

class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        // Сравнение по возрасту
        int ageCompare = Integer.compare(p1.age(), p2.age());
        if (ageCompare != 0) {
            return ageCompare;
        }
        // Если возраст одинаковый, сравниваем по имени
        return p1.name().compareTo(p2.name());
    }
}