/*
Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2))
*/


package linkedList;
import java.util.LinkedList;
import java.util.Collections;

public class LinkedListSwapElements {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");   // index 0
        colors.add("Blue");  // index 1
        colors.add("Green"); // index 2
        colors.add("Yellow");

        System.out.println("Before swapping: " + colors);

        // Swap first and third elements (index 0 and 2)
        Collections.swap(colors, 0, 2);

        System.out.println("After swapping 1st and 3rd elements: " + colors);
    }
}
