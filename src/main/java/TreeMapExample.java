import java.util.TreeMap;

public class TreeMapExample {
    private TreeMap<Integer, String> map;

    public TreeMapExample() {
        map = new TreeMap<>();
    }

    // Добавление элемента в коллекцию
    public void addElement(int key, String value) {
        map.put(key, value);
    }

    // Удаление элемента из коллекции
    public void removeElement(int key) {
        map.remove(key);
    }

    // Поиск элемента по ключу
    public boolean containsKey(int key) {
        return map.containsKey(key);
    }

    // Вывод всех элементов через цикл for-each
    public void printElements() {
        for (var entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
