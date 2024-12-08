package patterns.behavioral;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message); // Метод для получения обновлений.
}

class Subscriber implements Observer {
    private final String name;

    public Subscriber(String name) {
        this.name = name; // Имя подписчика.
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received: " + message); // Получение сообщения.
    }
}

class Publisher {
    private final List<Observer> observers = new ArrayList<>(); // Список подписчиков.

    public void subscribe(Observer observer) { // Добавление подписчика.
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) { // Удаление подписчика.
        observers.remove(observer);
    }

    public void notifyObservers(String message) { // Уведомление подписчиков.
        for (Observer observer : observers) {
            observer.update(message); // Каждому отправляем сообщение.
        }
    }
}

class ObserverMain {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        Subscriber subscriber1 = new Subscriber("Alice"); // Создаем подписчика.
        Subscriber subscriber2 = new Subscriber("Bob");

        publisher.subscribe(subscriber1); // Подписываем Alice.
        publisher.subscribe(subscriber2); // Подписываем Bob.

        publisher.notifyObservers("New article available!"); // Оповещаем подписчиков.
    }
}