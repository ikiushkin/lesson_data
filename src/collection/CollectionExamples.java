package collection;

import java.util.*;

public class CollectionExamples {

    public static void main(String[] args) {
//        exampleAddRemoveContains();
//        System.out.println("-------------------------------");
        exampleIterator();
//        System.out.println("-------------------------------");
//        exampleToArray();
    }

    // Пример 1: Использование методов add(), remove(), contains()
    public static void exampleAddRemoveContains() {
        System.out.println("Пример 1: Использование методов add(), remove(), contains()");

        Collection<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Коллекция содержит 'Banana': " + fruits.contains("Banana"));

        fruits.remove("Banana");
        System.out.println("После удаления 'Banana': " + fruits);

        System.out.println("Размер коллекции: " + fruits.size());
    }

    // Пример 2: Итерация по коллекции с использованием итератора
    public static void exampleIterator() {
        System.out.println("Пример 2: Итерация по коллекции с использованием итератора");

        Collection<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove(); // Удаление четных чисел
            }
        }

        System.out.println("После удаления четных чисел: " + numbers);
    }

    // Пример 3: Преобразование коллекции в массив
    public static void exampleToArray() {
        System.out.println("Пример 3: Преобразование коллекции в массив");

        Collection<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("core.Cat");
        animals.add("Horse");

        String[] animalArray = animals.toArray(new String[0]);
        System.out.println("Массив животных: " + Arrays.toString(animalArray));
    }
}