package patterns.structure;

import java.util.ArrayList;
import java.util.List;

public class CompositePattern {

    // Общий интерфейс для всех компонентов дерева
    interface Component {
        void operation();  // Операция, которая будет выполняться
    }

    // Листья дерева (не имеют дочерних элементов)
    static class Leaf implements Component {
        private final String name;

        public Leaf(String name) {
            this.name = name;
        }

        @Override
        public void operation() {
            System.out.println("Leaf " + name + " operation");
        }
    }

    // Узел дерева, который может содержать другие компоненты
    static class Composite implements Component {
        private final List<Component> children = new ArrayList<>();

        // Добавить дочерний элемент
        public void add(Component component) {
            children.add(component);
        }

        // Удалить дочерний элемент
        public void remove(Component component) {
            children.remove(component);
        }

        // Выполнить операцию для всех дочерних элементов
        @Override
        public void operation() {
            System.out.println("Composite operation");
            for (Component child : children) {
                child.operation();  // Рекурсивный вызов для дочерних элементов
            }
        }
    }

    // Клиентский код
    public static void main(String[] args) {
        // Создаём листья
        Leaf leaf1 = new Leaf("A");
        Leaf leaf2 = new Leaf("B");

        // Создаём композит (узел) и добавляем в него листья
        Composite composite1 = new Composite();
        composite1.add(leaf1);
        composite1.add(leaf2);

        // Создаём ещё один композит (дерево) и добавляем в него другие узлы
        Composite composite2 = new Composite();
        composite2.add(new Leaf("C"));
        composite2.add(composite1);

        // Выполняем операцию для всей структуры
        composite2.operation();
    }
}