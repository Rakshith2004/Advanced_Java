/*
 4. Write a Java program to get the first (lowest) key and the last (highest) key currently in the
following Treemap.
("C2", "Red"),("C1", "Green"), ("C4", "Black"), ("C3", "White")
 */

package Collections;

import java.util.TreeMap;
public class TreeMapKey {
	public static void main(String [] arg)
	{
		TreeMap<String,String> m=new TreeMap<>();
		m.put("C1","Apple");
		m.put("C2","Strawberry");
		m.put("C3","Pear"); 
		System.out.println("First Key "+m.firstKey());
		System.out.println("Last Key "+m.lastKey());	
	}
}
