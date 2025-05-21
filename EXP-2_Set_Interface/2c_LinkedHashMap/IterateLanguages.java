/*
 3. Include the following elements into the LinkedHashMap called programminglanguages and print as
follows.
Java was developed in 1995
Python was developed in 1991.
JavaScript was developed in 1995
C++ was developed in 1985
 */

package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class IterateLanguages {
	public static void main(String[] arg) {
		LinkedHashMap<String, String> m = new LinkedHashMap<>();
		m.put("Java", "1995");
		m.put("Python", "1991");
		m.put("JavaScript", "1995");

		for (Map.Entry<String, String> entry : m.entrySet()) {
			System.out.println(entry.getKey() + " developed in " + entry.getValue());
		}
	}
}
