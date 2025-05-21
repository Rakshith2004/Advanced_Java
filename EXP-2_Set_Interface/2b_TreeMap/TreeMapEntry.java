/*
 1. Write a Java program to traverse / iterate all the keys with the specified value in a TreeMap
(1,”Apple”), (2,”Strawberry”), (3,”Pear”), (4,”Cucumber”), (5,”Grapes”)
 */


package Collections;

import java.util.*;
public class TreeMapEntry {
	public static void main(String [] arg)
	{
		TreeMap<String,String> m=new TreeMap<>();
		m.put("C1","Apple");
		m.put("C2","Strawberry");
		m.put("C3","Pear"); 
		for (Map.Entry<String,String> entry : m.entrySet()) {
			 System.out.println(entry.getKey() + " -> " + entry.getValue());
			 }
	}
}
