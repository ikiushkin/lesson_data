package patterns.structure;

public class AdapterPattern {
    // Интерфейс, который ожидает клиент
    interface Target {
        void request();
    }

    // Класс, который нужно адаптировать (несовместимый интерфейс)
    static class Adaptee {
        public void specificRequest() {
            System.out.println("Specific request from Adaptee");
        }
    }

    // Адаптер, который преобразует интерфейс Adaptee в интерфейс Target
    static class Adapter implements Target {
        private Adaptee adaptee;

        public Adapter(Adaptee adaptee) {
            this.adaptee = adaptee;
        }

        @Override
        public void request() {
            // Преобразование вызова
            adaptee.specificRequest();
        }
    }

    // Клиент, который работает только с Target
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();  // Объект с несовместимым интерфейсом
        Target target = new Adapter(adaptee);  // Адаптер, который оборачивает Adaptee
        target.request();  // Клиент вызывает метод через ожидаемый интерфейс
    }
}