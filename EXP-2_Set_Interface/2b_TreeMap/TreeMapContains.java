/*
 2. Write a Java program to search for keys C4 and C5 are present or not in the following Tree Map.
("C1", "Red"); ("C2", "Green"); ("C3", "Black");("C4", "White")
 */


package Collections;

import java.util.TreeMap;
public class TreeMapContains {
	public static void main(String [] arg)
	{
		TreeMap<String,String> m=new TreeMap<>();
		m.put("C1","Apple");
		m.put("C2","Strawberry");
		m.put("C3","Pear"); 
		System.out.println("KEY C1 present "+m.containsKey("C1"));
		System.out.println("KEY C4 present "+m.containsKey("C4"));
	}
}
