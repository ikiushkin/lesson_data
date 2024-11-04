package collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> fruits = new LinkedHashSet<>();

        // Добавление элементов
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple"); // Дубликат, не будет добавлен
        System.out.println("LinkedHashSet: " + fruits);

        // Итерация по множеству
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.remove("Apple");
        System.out.println("LinkedHashSet: " + fruits);
    }
}
