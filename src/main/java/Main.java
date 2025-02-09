public class Main {
    public static void main(String[] args) {
        // Работа с ArrayList
        ArrayListExample arrayListExample = new ArrayListExample();
        arrayListExample.addElement(10);
        arrayListExample.addElement(20);
        arrayListExample.printElements();
        System.out.println(arrayListExample.containsElement(20));
        arrayListExample.removeElement(10);
        arrayListExample.printElements();
        arrayListExample.

        // Работа с HashSet
        HashSetExample hashSetExample = new HashSetExample();
        hashSetExample.addElement(30);
        hashSetExample.addElement(40);
        hashSetExample.printElements();
        System.out.println(hashSetExample.containsElement(40));
        hashSetExample.removeElement(30);
        hashSetExample.printElements();

        // Работа с LinkedList
        LinkedListExample linkedListExample = new LinkedListExample();
        linkedListExample.addElement(50);
        linkedListExample.addElement(60);
        linkedListExample.printElements();
        System.out.println(linkedListExample.containsElement(50));
        linkedListExample.removeElement(50);
        linkedListExample.printElements();

        // Работа с TreeMap
        TreeMapExample treeMapExample = new TreeMapExample();
        treeMapExample.addElement(1, "One");
        treeMapExample.addElement(2, "Two");
        treeMapExample.printElements();
        System.out.println(treeMapExample.containsKey(1));
        treeMapExample.removeElement(1);
        treeMapExample.printElements();
    }
}
