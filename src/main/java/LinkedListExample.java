import java.util.LinkedList;

public class LinkedListExample {
    private LinkedList<Integer> list;

    public LinkedListExample() {
        list = new LinkedList<>();
    }

    // Добавление элемента в коллекцию
    public void addElement(int element) {
        list.add(element);
    }

    // Удаление элемента из коллекции
    public void removeElement(int element) {
        list.remove(Integer.valueOf(element));
    }

    // Поиск элемента в коллекции
    public boolean containsElement(int element) {
        return list.contains(element);
    }

    // Вывод всех элементов через цикл for
    public void printElements() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
