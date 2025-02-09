import java.util.ArrayList;

public class ArrayListExample {
    private ArrayList<Integer> list;
    private ArrayList<Integer> oddNumbers;

    public ArrayListExample() {
        list = new ArrayList<>();
        oddNumbers = new ArrayList<>();
    }

    // Добавление элемента в коллекцию
    public void addElement(int element) {
        list.add(element);
        if (element % 2 != 0) oddNumbers.add(element);
    }

    // Удаление элемента из коллекции
    public void removeElement(int element) {
        list.remove(Integer.valueOf(element));
    }

    // Поиск элемента в коллекции
    public boolean containsElement(int element) {
        return list.contains(element);
    }

    // Вывод всех элементов через цикл for-each
    public void printElements() {
        for (int element : list) {
            System.out.println(element);
        }
    }
}
