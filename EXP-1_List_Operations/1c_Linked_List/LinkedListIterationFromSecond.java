/*
Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
*/


package linkedList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterationFromSecond {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        
        // Start iterating from index 1 (i.e., 2nd element)
        ListIterator<String> iterator = colors.listIterator(1);
        System.out.println("Iterating from the 2nd element:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
