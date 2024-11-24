package func;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMapExample {
    public static void main(String[] args) {
        // Список объектов Person
        List<Person> people = Arrays.asList(
            new Person(1, "Alice"),
            new Person(2, "Bob"),
            new Person(3, "Charlie")
        );

        // Преобразование в Map, где ключ — ID, значение — имя
        Map<Integer, String> idToNameMap = people.stream()
            .collect(Collectors.toMap(
                Person::id,  // Ключ — ID
                Person::name // Значение — имя
            ));

        System.out.println("ID to Name Map: " + idToNameMap);

        // Преобразование в Map, где ключ — ID, значение — объект Person
        Map<Integer, Person> idToPersonMap = people.stream()
            .collect(Collectors.toMap(
                Person::id,  // Ключ — ID
                Function.identity() // Значение — сам объект
            ));

        System.out.println("ID to Person Map: " + idToPersonMap);
    }
}

record Person(int id, String name) {

    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + "'}";
    }
}