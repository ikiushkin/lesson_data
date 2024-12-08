package patterns.create;

public class Singleton {

    private static Singleton instance; // Единственный экземпляр класса.

    private Singleton() {} // Приватный конструктор, чтобы предотвратить создание экземпляра извне.

    public static Singleton getInstance() {
        if (instance == null) { // Проверяем, создан ли уже экземпляр.
            synchronized (Singleton.class) { // Блокируем поток, чтобы избежать проблем в многопоточности.
                if (instance == null) { // Повторная проверка в блоке синхронизации.
                    instance = new Singleton(); // Создаем экземпляр.
                }
            }
        }
        return instance; // Возвращаем единственный экземпляр.
    }
}