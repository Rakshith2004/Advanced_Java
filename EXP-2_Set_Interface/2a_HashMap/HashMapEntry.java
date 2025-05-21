/*
 1. Write a Java program to traverse / iterate all the keys with the specified value in a HashMap
(1,”Apple”), (2,”Strawberry”), (3,”Pear”), (4,”Cucumber”), (5,”Grapes”)
[ hint : 6. Iterating Over Map in the worked out example]
 */

package Collections;
import java.util.*;
public class HashmapEntry {
	public static void main(String [] arg)
	{
		HashMap<Integer,String> m=new HashMap<>();
		m.put(1,"Apple");
		m.put(2,"Strawberry");
		m.put(3,"Pear"); 
		
		for (Map.Entry<Integer,String> entry : m.entrySet()) {
			 System.out.println(entry.getKey() + " -> " + entry.getValue());
			 }	
	}

}
