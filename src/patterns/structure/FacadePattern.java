package patterns.structure;

// Подсистемы, каждая выполняет свою задачу.
class Light {
    public void turnOn() {
        System.out.println("Lights turned on."); // Включаем свет.
    }

    public void turnOff() {
        System.out.println("Lights turned off."); // Выключаем свет.
    }
}

class AirConditioner {
    public void turnOn() {
        System.out.println("Air Conditioner turned on."); // Включаем кондиционер.
    }

    public void turnOff() {
        System.out.println("Air Conditioner turned off."); // Выключаем кондиционер.
    }
}

class TV {
    public void turnOn() {
        System.out.println("TV turned on."); // Включаем телевизор.
    }

    public void turnOff() {
        System.out.println("TV turned off."); // Выключаем телевизор.
    }
}

// Класс Фасад: предоставляет упрощенный интерфейс для управления подсистемами.
class SmartHomeFacade {
    private Light light;
    private AirConditioner airConditioner;
    private TV tv;

    public SmartHomeFacade() {
        // Создаем объекты подсистем.
        this.light = new Light();
        this.airConditioner = new AirConditioner();
        this.tv = new TV();
    }

    // Включаем вечерний режим: свет, кондиционер и телевизор.
    public void activateEveningMode() {
        System.out.println("Activating Evening Mode...");
        light.turnOn();
        airConditioner.turnOn();
        tv.turnOn();
    }

    // Отключаем вечерний режим: выключаем все устройства.
    public void deactivateEveningMode() {
        System.out.println("Deactivating Evening Mode...");
        light.turnOff();
        airConditioner.turnOff();
        tv.turnOff();
    }
}

// Клиентский код: взаимодействует только с фасадом, не касаясь подсистем напрямую.
class FacadeMain {
    public static void main(String[] args) {
        SmartHomeFacade smartHome = new SmartHomeFacade();

        smartHome.activateEveningMode();  // Включение вечернего режима.
        System.out.println("---");
        smartHome.deactivateEveningMode();  // Отключение вечернего режима.
    }
}