package collection;

import java.util.*;

public class LinkedListExamples {
    public static void main(String[] args) {
        // 1. Создание и инициализация
        LinkedList<String> fruits = new LinkedList<>();
        System.out.println("Создан пустой список: " + fruits);

        // 2. Добавление элементов
        fruits.add("Apple"); // O(1)
        fruits.add("Banana"); // O(1)
        fruits.add("Cherry"); // O(1)
        System.out.println("После добавления элементов: " + fruits);

        // 3. Вставка элемента по индексу
        fruits.add(1, "Apricot"); // O(n)
        System.out.println("После вставки 'Apricot' на индекс 1: " + fruits);

        // 4. Добавление в начало и конец
        fruits.addFirst("Avocado"); // O(1)
        fruits.addLast("Blackberry"); // O(1)
        System.out.println("После добавления в начало и конец: " + fruits);

        // 5. Получение элементов
        String firstFruit = fruits.getFirst(); // O(1)
        String lastFruit = fruits.getLast(); // O(1)
        String fruitAtIndex2 = fruits.get(2); // O(n)
        System.out.println("Первый элемент: " + firstFruit);
        System.out.println("Последний элемент: " + lastFruit);
        System.out.println("Элемент на индексе 2: " + fruitAtIndex2);

        // 6. Удаление элементов
        fruits.removeFirst(); // O(1)
        fruits.removeLast(); // O(1)
        System.out.println("После удаления первого и последнего элементов: " + fruits);

        fruits.remove("Banana"); // O(n)
        System.out.println("После удаления 'Banana': " + fruits);

        fruits.remove(2); // O(n)
        System.out.println("После удаления элемента на индексе 2: " + fruits);

        // 7. Проверка наличия элемента
        boolean hasCherry = fruits.contains("Cherry"); // O(n)
        System.out.println("Содержит ли список 'Cherry': " + hasCherry);

        // 8. Использование как очередь
        Queue<String> fruitQueue = new LinkedList<>(fruits);
        fruitQueue.offer("Date"); // O(1)
        System.out.println("Очередь после добавления 'Date': " + fruitQueue);
        String head = fruitQueue.poll(); // O(1)
        System.out.println("Извлеченный элемент из очереди: " + head);
        System.out.println("Очередь после извлечения: " + fruitQueue);

        // 9. Использование как стек
        Deque<String> fruitStack = new LinkedList<>(fruits);
        fruitStack.push("Elderberry"); // O(1)
        System.out.println("Стек после добавления 'Elderberry': " + fruitStack);
        String top = fruitStack.pop(); // O(1)
        System.out.println("Извлеченный элемент из стека: " + top);
        System.out.println("Стек после извлечения: " + fruitStack);

        // 10. Итерация по списку
        System.out.println("Итерация с помощью цикла for-each:");
        for (String fruit : fruits) { // O(n)
            System.out.println(fruit);
        }

        System.out.println("Итерация с помощью итератора:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) { // O(n)
            System.out.println(iterator.next());
        }

        // 11. Преобразование в массив
        String[] fruitsArray = fruits.toArray(new String[0]); // O(n)
        System.out.println("Массив фруктов: " + Arrays.toString(fruitsArray));

        // 12. Очистка списка
        fruits.clear(); // O(n)
        System.out.println("После очистки список: " + fruits);

        // 13. Проверка на пустоту
        boolean isEmpty = fruits.isEmpty(); // O(1)
        System.out.println("Список пустой: " + isEmpty);
    }
}