/*
 1. Write a Java program to traverse / iterate all the keys with the specified value in a linked
HashMap (1,”Apple”), (2,”Strawberry”), (3,”Pear”), (4,”Cucumber”), (5,”Grapes”) and display
only elderly entered 4 elements only
 */

package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapLoop {
	public static void main(String[] arg) {
		LinkedHashMap<Integer, String> m = new LinkedHashMap<>();
		m.put(1, "Apple");
		m.put(2, "Strawberry");
		m.put(3, "Chikku");
		m.put(5, "Kiwi");

		int count = m.size() - 1;
		for (Map.Entry<Integer, String> entry : m.entrySet()) {
			if (count > 0) {
				System.out.println(entry.getKey() + " -> " + entry.getValue());
				count--;
			} else {
				break;
			}

		}
	}
}
