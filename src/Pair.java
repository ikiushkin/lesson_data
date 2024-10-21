class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("One", 1);
        System.out.println("Key: " + pair.getKey());   // Вывод: Key: One
        System.out.println("Value: " + pair.getValue());  // Вывод: Value: 1

        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Hello", "Generics"};

        printArray(intArray);  // Вывод: 1 2 3 4 5
        printArray(strArray);  // Вывод: Hello Generics
    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}