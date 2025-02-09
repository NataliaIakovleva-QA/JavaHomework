import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    private HashSet<Integer> set;

    public HashSetExample() {
        set = new HashSet<>();
    }

    // Добавление элемента в коллекцию
    public void addElement(int element) {
        set.add(element);
    }

    // Удаление элемента из коллекции
    public void removeElement(int element) {
        set.remove(element);
    }

    // Поиск элемента в коллекции
    public boolean containsElement(int element) {
        return set.contains(element);
    }

    // Вывод всех элементов через Iterator
    public void printElements() {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
