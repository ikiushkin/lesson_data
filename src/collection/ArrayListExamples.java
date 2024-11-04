package collection;

import java.util.*;

public class ArrayListExamples {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);

        // 1. Создание и инициализация
        List<String> fruits = new ArrayList<>();
        System.out.println("Создан пустой список: " + fruits);

        // 2. Добавление элементов
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("После добавления элементов: " + fruits);

        // 3. Вставка элемента по индексу
        fruits.add(1, "Apricot");
        System.out.println("После вставки 'Apricot' на индекс 1: " + fruits);

        // 4. Получение элемента по индексу
        String fruitAtIndex2 = fruits.get(2);
        System.out.println("Элемент на индексе 2: " + fruitAtIndex2);

        // 5. Обновление элемента
        fruits.set(2, "Blackberry");
        System.out.println("После обновления элемента на индексе 2: " + fruits);

        // 6. Удаление элементов
        fruits.remove(3); // Удаление по индексу
        System.out.println("После удаления элемента на индексе 3: " + fruits);

        fruits.remove("Apple"); // Удаление по значению
        System.out.println("После удаления 'Apple': " + fruits);

        // 7. Поиск элементов
        boolean hasBanana = fruits.contains("Banana");
        System.out.println("Содержит ли список 'Banana': " + hasBanana);

        int indexOfBanana = fruits.indexOf("Apricot");
        System.out.println("Индекс 'Apricot': " + indexOfBanana);

        // 8. Размер списка
        int size = fruits.size();
        System.out.println("Размер списка: " + size);

        // 9. Итерация по списку
        System.out.println("Итерация с помощью цикла for с индексом:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Элемент " + i + ": " + fruits.get(i));
        }

        System.out.println("Итерация с помощью цикла for-each:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Итерация с помощью итератора:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        // 10. Сортировка
        fruits.add("Date");
        fruits.add("Elderberry");
        System.out.println("Перед сортировкой: " + fruits);
        Collections.sort(fruits);
        System.out.println("После сортировки: " + fruits);

        // 11. Сортировка с компаратором (обратный порядок)
        fruits.sort(Collections.reverseOrder());
        System.out.println("После сортировки в обратном порядке: " + fruits);

        // 12. Преобразование в массив
        String[] fruitsArray = fruits.toArray(new String[0]);
        System.out.println("Массив фруктов: " + Arrays.toString(fruitsArray));

        // 13. Очистка списка
        fruits.clear();
        System.out.println("После очистки список: " + fruits);

        // 14. Проверка на пустоту
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Список пустой: " + isEmpty);


        // Capacity пример
        int numberOfElements = 10_000_000;

        // ArrayList с емкостью по умолчанию
        long startTime1 = System.nanoTime();
        ArrayList<Integer> defaultCapacityList = new ArrayList<>();
        for (int i = 0; i < numberOfElements; i++) {
            defaultCapacityList.add(i);
        }
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;
        System.out.println("Время добавления в ArrayList с емкостью по умолчанию: " + (duration1 / 1_000_000) + " мс");

        // ArrayList с заранее заданной емкостью
        long startTime2 = System.nanoTime();
        ArrayList<Integer> customCapacityList = new ArrayList<>(numberOfElements);
        for (int i = 0; i < numberOfElements; i++) {
            customCapacityList.add(i);
        }
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;
        System.out.println("Время добавления в ArrayList с заданной емкостью: " + (duration2 / 1_000_000) + " мс");
    }
}
