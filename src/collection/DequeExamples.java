package collection;

import java.util.*;

public class DequeExamples {
    public static void main(String[] args) {
        // Создание очереди на основе LinkedList
        Queue<String> queue = new LinkedList<>();
        System.out.println("Создана пустая очередь: " + queue);

        // 1. Добавление элементов
        queue.offer("Element1"); // O(1)
        queue.offer("Element2"); // O(1)
        queue.offer("Element3"); // O(1)
        System.out.println("После добавления элементов: " + queue);

        // 2. Получение элемента без удаления
        String head = queue.peek(); // O(1)
        System.out.println("Голова очереди (peek): " + head);
        System.out.println("После peek: " + queue);

        // 3. Удаление и получение элемента
        String removedElement = queue.poll(); // O(1)
        System.out.println("Удаленный элемент (poll): " + removedElement);
        System.out.println("Очередь после удаления: " + queue);

        // 4. Проверка пустоты очереди
        boolean isEmpty = queue.isEmpty(); // O(1)
        System.out.println("Очередь пуста: " + isEmpty);

        // 5. Итерация по очереди
        System.out.println("Итерация по очереди:");
        for (String element : queue) { // O(n)
            System.out.println(element);
        }

        // 6. Использование PriorityQueue
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(5); // O(log n)
        priorityQueue.offer(1); // O(log n)
        priorityQueue.offer(3); // O(log n)
        System.out.println("PriorityQueue: " + priorityQueue);

        while (!priorityQueue.isEmpty()) {
            System.out.println("Удален элемент из PriorityQueue: " + priorityQueue.poll()); // O(log n)
        }

        // Создание Deque на основе ArrayDeque
        Deque<String> deque = new ArrayDeque<>();
        System.out.println("Создана пустая Deque: " + deque);

        // 1. Добавление элементов в начало и конец
        deque.addFirst("Element1"); // O(1)
        deque.addLast("Element2");  // O(1)
        deque.offerFirst("Element0"); // O(1)
        deque.offerLast("Element3");  // O(1)
        System.out.println("После добавления элементов: " + deque);

        // 2. Получение элементов без удаления
        String firstElement = deque.peekFirst(); // O(1)
        String lastElement = deque.peekLast();   // O(1)
        System.out.println("Первый элемент (peekFirst): " + firstElement);
        System.out.println("Последний элемент (peekLast): " + lastElement);

        // 3. Удаление и получение элементов
        String removedFirst = deque.pollFirst(); // O(1)
        String removedLast = deque.pollLast();   // O(1)
        System.out.println("Удаленный первый элемент (pollFirst): " + removedFirst);
        System.out.println("Удаленный последний элемент (pollLast): " + removedLast);
        System.out.println("Deque после удаления: " + deque);

        // 4. Использование как стек
        deque.push("StackElement1"); // O(1)
        deque.push("StackElement2"); // O(1)
        System.out.println("Deque после добавления элементов в стек: " + deque);

        String poppedElement = deque.pop(); // O(1)
        System.out.println("Извлеченный элемент из стека (pop): " + poppedElement);
        System.out.println("Deque после извлечения из стека: " + deque);

        // 5. Итерация по Deque
        System.out.println("Итерация по Deque:");
        for (String element : deque) { // O(n)
            System.out.println(element);
        }

        // 6. Проверка наличия элемента
        boolean containsElement = deque.contains("Element2"); // O(n)
        System.out.println("Deque содержит 'Element2': " + containsElement);

        // 7. Очистка Deque
        deque.clear(); // O(n)
        System.out.println("Deque после очистки: " + deque);
    }
}
