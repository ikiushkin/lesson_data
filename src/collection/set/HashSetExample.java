package collection.set;

import java.util.HashSet;
import java.util.Set;
/*	1.	HashSet
	2.	LinkedHashSet
	3.	TreeSet
	4.	EnumSet
	5.	CopyOnWriteArraySet
	6.	ConcurrentSkipListSet*/
public class HashSetExample {
    public static void main(String[] args) {
        // Создание HashSet
        Set<String> fruits = new HashSet<>(16, 0.5f);

        // Добавление элементов
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Дубликат, не будет добавлен

        // Вывод множества
        System.out.println("HashSet: " + fruits);

        // Проверка наличия элемента
        boolean hasBanana = fruits.contains("Banana");
        System.out.println("Содержит ли 'Banana': " + hasBanana);

        // Удаление элемента
        fruits.remove("Orange");
        System.out.println("После удаления 'Orange': " + fruits);

        // Итерация по HashSet
        System.out.println("Итерация по HashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
