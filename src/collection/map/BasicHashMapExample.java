package collection.map;

import java.util.HashMap;
import java.util.Map;

public class BasicHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Добавление элементов
        map.put("Яблоко", 10);
        map.put("Банан", 20);
        map.put("Апельсин", 30);

        // Получение значения по ключу
        int count = map.get("Банан");
        System.out.println("Количество бананов: " + count);

        // Проверка наличия ключа
        if (map.containsKey("Апельсин")) {
            System.out.println("Апельсины есть в наличии.");
        }

        // Удаление элемента
        map.remove("Яблоко");

        // Итерация по ключам и значениям
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}