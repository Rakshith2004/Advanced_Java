/*
Write a Java program to insert the specified element at the end of a linked list.( using l_listobj.offerLast("Pink"))
*/

package linkedList;
import java.util.LinkedList;

public class LinkedListOfferLast {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");

        colors.offerLast("Pink");

        System.out.println("After adding 'Pink' at the end:");
        System.out.println(colors);
    }
}
