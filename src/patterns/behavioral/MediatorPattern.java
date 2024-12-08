package patterns.behavioral;

import java.util.ArrayList;
import java.util.List;

// Интерфейс посредника, который определяет метод для отправки сообщений.
interface Mediator {
    void sendMessage(String message, Colleague sender); // Отправка сообщений от одного коллеги к другим.
    void addColleague(Colleague colleague); // Регистрация коллег в системе.
}

// Абстрактный класс коллеги, который взаимодействует с другими через посредника.
abstract class Colleague {
    protected Mediator mediator; // Ссылка на посредника.

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive(String message); // Метод для получения сообщений.
}

// Конкретный коллега — пользователь чата.
class User extends Colleague {
    private String name;

    public User(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    public void send(String message) {
        System.out.println(name + " sends: " + message);
        mediator.sendMessage(message, this); // Отправляем сообщение через посредника.
    }

    @Override
    public void receive(String message) {
        System.out.println(name + " receives: " + message); // Получаем сообщение.
    }
}

// Конкретный посредник — чат, который управляет сообщениями.
class ChatMediator implements Mediator {
    private List<Colleague> colleagues = new ArrayList<>(); // Список всех участников.

    @Override
    public void sendMessage(String message, Colleague sender) {
        // Отправляем сообщение всем коллегам, кроме отправителя.
        for (Colleague colleague : colleagues) {
            if (colleague != sender) {
                colleague.receive(message);
            }
        }
    }

    @Override
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague); // Регистрируем нового участника.
    }
}

// Клиентский код.
class MediatorMain {
    public static void main(String[] args) {
        // Создаем посредника (чат).
        Mediator chatMediator = new ChatMediator();

        // Создаем участников (пользователей).
        User user1 = new User(chatMediator, "Alice");
        User user2 = new User(chatMediator, "Bob");
        User user3 = new User(chatMediator, "Charlie");

        // Добавляем участников в чат.
        chatMediator.addColleague(user1);
        chatMediator.addColleague(user2);
        chatMediator.addColleague(user3);

        // Пользователи отправляют сообщения через посредника.
        user1.send("Hello, everyone!");
        user2.send("Hi, Alice!");
        user3.send("Hello, Bob and Alice!");
    }
}