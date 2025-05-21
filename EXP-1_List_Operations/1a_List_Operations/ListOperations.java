/*
1.a :- Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList and a LinkedList to 
perform the following operations with different functions directed as follows;
1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.Accessing elements,
5. Updating elements, 6. Removing elements, 7. Searching elements, 8. Listsize, 9. Iterating over list, 
10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list
*/

package arrayandlinked;
import java.util.*;

public class ListOperations {

    public static void main(String[] args) {
        // Create ArrayList and LinkedList
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        System.out.println("=== ArrayList Operations ===");
        performAllOperations(arrayList);

        System.out.println("\n=== LinkedList Operations ===");
        performAllOperations(linkedList);
    }

    // Perform all operations
    public static void performAllOperations(List<String> list) {
        addElements(list);
        addElementAtIndex(list);
        addMultipleElements(list);
        accessElement(list);
        updateElement(list);
        removeElement(list);
        searchElement(list);
        listSize(list);
        iterateUsingForEach(list);
        iterateUsingIterator(list);
        sortList(list);
        subListExample(list);
        clearList(list);
    }

    // 1. Add initial elements
    public static void addElements(List<String> list) {
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("After adding elements: " + list);
    }

    // 2. Add element at specific index
    public static void addElementAtIndex(List<String> list) {
        list.add(1, "Mango");
        System.out.println("After adding at index 1: " + list);
    }

    // 3. Add multiple elements
    public static void addMultipleElements(List<String> list) {
        List<String> moreFruits = Arrays.asList("Grapes", "Pineapple");
        list.addAll(moreFruits);
        System.out.println("After adding multiple elements: " + list);
    }

    // 4. Accessing elements
    public static void accessElement(List<String> list) {
        String fruit = list.get(2);
        System.out.println("Element at index 2: " + fruit);
    }

    // 5. Updating elements
    public static void updateElement(List<String> list) {
        list.set(0, "Kiwi");
        System.out.println("After updating index 0: " + list);
    }

    // 6. Removing elements
    public static void removeElement(List<String> list) {
        list.remove("Banana");
        System.out.println("After removing 'Banana': " + list);
    }

    // 7. Searching elements
    public static void searchElement(List<String> list) {
        boolean found = list.contains("Orange");
        System.out.println("List contains 'Orange'? " + found);
    }

    // 8. List size
    public static void listSize(List<String> list) {
        System.out.println("List size: " + list.size());
    }

    // 9. Iterating using for-each loop
    public static void iterateUsingForEach(List<String> list) {
        System.out.print("Iterating using for-each: ");
        for (String fruit : list) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }

    // 10. Using Iterator
    public static void iterateUsingIterator(List<String> list) {
        System.out.print("Iterating using Iterator: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    // 11. Sorting the list
    public static void sortList(List<String> list) {
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
    }

    // 12. Sublist
    public static void subListExample(List<String> list) {
        if (list.size() >= 3) {
            List<String> subList = list.subList(1, 3);
            System.out.println("Sublist (1 to 2): " + subList);
        }
    }

    // 13. Clearing the list
    public static void clearList(List<String> list) {
        list.clear();
        System.out.println("After clearing the list: " + list);
    }
}
