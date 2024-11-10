package collection.map;

public class HashMapBucketCalculationExample {
    public static void main(String[] args) {
        String key = "example";
        int n = 16; // Размер массива бакетов

        // 1. Получение хеш-кода ключа
        int h = key.hashCode();
        System.out.println("hashCode(): " + h);

        // 2. Дополнительная обработка хеш-кода
        int hash = h ^ (h >>> 16);
        System.out.println("hash after processing: " + hash);

        // 3. Вычисление индекса бакета
        int index = (n - 1) & hash;
        System.out.println("Bucket index: " + index);
    }
}

//h = -1322970774
//h >>> 16 = -1322970774 >>> 16 = 45349
//hash = h ^ (h >>> 16) = -1322970774 ^ 45349 = -1322934193

//n = 16
//index = (n - 1) & hash = 15 & -1322934193 = 15

//table[5] -> Node(hash, key, value)